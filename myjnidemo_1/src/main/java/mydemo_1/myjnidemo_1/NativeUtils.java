package mydemo_1.myjnidemo_1;

/**
 * 创建者：wanglei
 * <p>时间：16/9/18  20:16
 * <p>类描述：javah -d ../jni mydemo_1.myjnidemo_1.NativeUtils
 * <p>修改人：/Users/wanglei/Downloads/wwww_3/MyApplication/myjnidemo_1/src/main/java
 * <p>修改时间：mydemo_1.myjnidemo_1.NativeUtils
 * <p>修改备注：
 */
public class NativeUtils {
    static {
        System.loadLibrary("MyDemoLibJN");
    }

    public static native String getStr();
}
