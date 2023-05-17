package com.faintdream.cmd.demo;

/**
 * 测试在控制台输出不同颜色的字符
 * @author faintdream
 * @version 1.0
 * */
public class ColoredConsoleOutput {
    public static void main(String[] args) {
        // ANSI 转义序列
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_CYAN = "\u001B[36m";

        // 输出不同颜色的文本
        System.out.println(ANSI_RED + "这是红色的文本" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "这是绿色的文本" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "这是青色的文本" + ANSI_RESET);
    }
}
