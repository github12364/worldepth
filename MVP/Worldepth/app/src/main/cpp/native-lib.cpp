#include <jni.h>
#include <string>
#include <opencv2/core/core.hpp>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_leodw_worldepth_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C"
JNIEXPORT void JNICALL
Java_com_example_leodw_worldepth_slam_Slam_passImage(JNIEnv *env, jobject instance, jbyteArray img) {
    jbyte* _img  = env->GetByteArrayElements(img, 0);
    cv::Mat mimg(rows, cols, CV_8UC1, (unsigned char *)_img);
    env->ReleaseByteArrayElements(img, _img, 0);
}