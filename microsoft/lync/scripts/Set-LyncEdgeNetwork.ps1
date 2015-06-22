param(
    [string]
    $VPCCidr = '10.0.0.0/16',

    [string[]]
    $DNSAddresses = @('10.0.0.10','10.0.64.10')
)

$adapters = Get-NetAdapter | sort ifindex -Descending

Rename-NetAdapter -Name $adapters[1].Name -NewName External
Rename-NetAdapter -Name $adapters[0].Name -NewName Internal

$ext = Get-NetIPConfiguration -InterfaceAlias external
$int = Get-NetIPConfiguration -InterfaceAlias internal

$extConfig = Get-NetIPAddress -InterfaceAlias external | ?{$_.IpAddress -eq $ext.IPv4Address.IpAddress}
$intConfig = Get-NetIPAddress -InterfaceAlias internal | ?{$_.IpAddress -eq $int.IPv4Address.IpAddress}

Get-NetAdapter | Set-NetIPInterface -DHCP Disabled
Get-NetAdapter external | New-NetIPAddress -AddressFamily IPv4 -IPAddress $ext.IPv4Address.IpAddress -PrefixLength $extConfig.PrefixLength -DefaultGateway $ext.IPv4DefaultGateway.NextHop
Get-NetAdapter internal | New-NetIPAddress -AddressFamily IPv4 -IPAddress $int.IPv4Address.IpAddress -PrefixLength $intConfig.PrefixLength

Invoke-Expression "netsh interface ipv4 add route $VPCCidr internal $($int.IPv4DefaultGateway.NextHop)"

Get-NetAdapter | Set-DnsClientServerAddress -ServerAddresses $DNSAddresses