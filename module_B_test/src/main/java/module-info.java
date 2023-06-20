module module_B_test {
    // 导出的包
    exports com.faintdream.b;

    // 依赖的模块(不依赖别的模块)
    requires transitive module_A_test;
}