#include <jni.h>
#include <string>
#include <opencv2/core/core.hpp>
#include <RunSlam.h>

using namespace std;

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_leodw_worldepth_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

/* extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_leodw_worldepth_slam_Slam_passImageToSlam(JNIEnv *env, jobject instance, jint width, jint height, jbyteArray img, jlong timeStamp) {
    jbyte* _img  = env->GetByteArrayElements(img, 0);
    cv::Mat mimg(width, height, CV_8UC1, (unsigned char *)_img);
    double tframe = (double) timeStamp;
    //SLAM.TrackMonocular(mimg, tframe);
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
} */

