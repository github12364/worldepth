//
// Created by Soren Dahl on 12/27/18.
//

#ifndef WORLDEPTH_RUNSLAM_H
#define WORLDEPTH_RUNSLAM_H

#include <opencv2/core/mat.hpp>

//call this fist to start the TrackingInit and threads
void start();

//call this for each frame
void process(cv::Mat im, double tstamp);

//call this at the end, writes the map to the file and closes things
void end(std::string filename);


#endif //WORLDEPTH_RUNSLAM_H
