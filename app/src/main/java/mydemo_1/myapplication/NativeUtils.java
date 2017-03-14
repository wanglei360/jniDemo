package mydemo_1.myapplication;

/**
 * 创建者：wanglei
 * <p>时间：16/9/18  20:16
 * <p>类描述：
 * <p>修改人：
 * <p>修改时间：/Users/wanglei/Downloads/wwww_3/MyApplication/app/src/main/java
 * <p>修改备注：mydemo_1.myapplication.NativeUtils
 * cd ..    返回上一级
 * cd /     返回根目录
 * javah -d ../jni mydemo_1.myapplication.NativeUtils
 *  todo 必须要进入到当前NativeUtils所在的Java目录在执行才能用
 */
public class NativeUtils {
    static {
        System.loadLibrary("NativeExample");
    }

    public static native String getStr();
    public static native String getStr(String str);
}
