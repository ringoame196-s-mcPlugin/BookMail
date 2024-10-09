package com.github.ringoame196_s_mcPlugin.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter

class TabCompleter : TabCompleter {
    override fun onTabComplete(commandSender: CommandSender, command: Command, label: String, args: Array<out String>): MutableList<String>? {
        return when(args.size) {
            1 -> mutableListOf(CommandConst.SEND_COMMAND, CommandConst.DISPLAY_COMMAND, CommandConst.BLOCK_COMMAND, CommandConst.UN_BLOCK_COMMAND)
            2 -> when(args[0]) {
                CommandConst.SEND_COMMAND -> mutableListOf("[件名]")
                else -> mutableListOf()
            }
            3 -> when(args[1]) {
                CommandConst.SEND_COMMAND -> mutableListOf("[本文]")
                else -> mutableListOf()
            }
            else -> mutableListOf()
        }
    }
}
