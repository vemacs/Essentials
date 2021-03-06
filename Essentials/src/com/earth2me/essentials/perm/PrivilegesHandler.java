package com.earth2me.essentials.perm;

import org.bukkit.entity.Player;

public class PrivilegesHandler extends AbstractVaultHandler {
    @Override
    public boolean canBuild(Player base, String group) {
        return hasPermission(base, "privileges.build");
    }
}
