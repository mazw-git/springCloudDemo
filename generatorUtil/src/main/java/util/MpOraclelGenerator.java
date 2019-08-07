package util;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

 /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
public class MpOraclelGenerator {

    /**
     * <p>
     * MySQL 鐢熸垚婕旂ず
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
    // 选择 freemarker 引擎，默认 Veloctiy
    // mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D://workspace/generatorUtil/src/main/java");  //生成路径
        gc.setFileOverride(true); //文件覆盖
        gc.setIdType(IdType.AUTO); //主键策略
      // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setServiceName("%sService"); //生成Service首字母是否为I
        								//IUserService
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor("Yanghu");
        
        // .setKotlin(true)   // .setKotlin(true) 是否生成 kotlin 代码
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
       

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.ORACLE);  //数据库类型
        dsc.setDriverName("oracle.jdbc.driver.OracleDriver");
        dsc.setUsername("zfl");
        dsc.setPassword("zfl");
        dsc.setUrl("jdbc:oracle:thin:@192.168.5.14:1521:crmolap");
        
       /* dsc.setTypeConvert(new MySqlTypeConvert(){
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("杞崲绫诲瀷锛�" + fieldType);
         // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });*/
       

        // 绛栫暐閰嶇疆
        StrategyConfig strategy = new StrategyConfig();
        strategy.setCapitalMode(true);// 鍏ㄥ眬澶у啓鍛藉悕 ORACLE 娉ㄦ剰
        strategy.setDbColumnUnderline(true);//鎸囧畾琛ㄥ悕  瀛楁鍚嶆槸鍚︿娇鐢ㄤ笅鍒掔嚎
        strategy.setNaming(NamingStrategy.underline_to_camel);// 琛ㄥ悕鐢熸垚绛栫暐,涓嬪垝绾胯浆椹煎嘲
        //strategy.setTablePrefix(new String[] { "tb_"});// 姝ゅ鍙互淇敼涓烘偍鐨勮〃鍓嶇紑
        strategy.setInclude(new String[] { "goods_sku_rule" }); // 闇�瑕佺敓鎴愮殑琛�
        
      

        // 策略配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.mazw");
        //pc.setModuleName("test");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setEntity("pojo");
        pc.setXml("mapper");
        
        
        // 包配置
        mpg.setGlobalConfig(gc);
        mpg.setDataSource(dsc);
        mpg.setStrategy(strategy);
        mpg.setPackageInfo(pc);


        // 整合配置
        mpg.execute();

    }

}