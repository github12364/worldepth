# worldepth2

Where to look for research:
Everyone look in research/notes/SLAMSegments/your topic.docx for some notes that I took.
Then look in research/papers/READ THIS ONE... and read the section about your topic.
Then look in research/papers for lsd_slam, orb_slam, and orb_slam2 for how your segment is implemented. Look at the references for further explanation and fine details. Follow it until you have step-by-step equations.





Getting Started:
1. Look at 3D examples.docx in the Research folder. This shows some basic 3D reconstruction examples and how the SLAM (Simultaneous Localization and Mapping) algorithm has evolved from aerial reconstructions.
2. Open Research/Links.docx and watch the first video link that says WATCH THIS ONE. Only watch the first part - the second half of the video is people asking inaudible questions and it stops making sense.
3. Go to Research/Papers and skim the SlamForDummiesSuperBasic pdf. This is not exactly what we are doing because they used a robot moving in two dimension equipped with a laser depth sensor. We are just going to be using a phone camera. Even so, this is a good overview.
4. Look in Research/Notes/SLAMSegments for some notes I took on each of the 7 major parts of the Simultaneous Localization and Mapping algorithm. The most important parts to understand are (obviously) the localization and mapping parts. These core components of the SLAM algorithm are outlined in SLAMSegment #'s 2, 3, and 4. 5, 6, and 7 are basically icing on the cake for better accuracy.
5. If you want even more info about SLAM, you can go into Research/Papers and read the SLAM survey paper that says READ THIS ONE. This is what I used to take most of the SLAMSegment notes. It also gives some information on what kinds of choices the primary open-source SLAM apps made. (The two biggest/most recent open-source SLAM systems are called LSD-SLAM and ORB-2 SLAM.)
6. Look at the Orb-Slam2 code. In my opinion, it's easier to read than the LSD-SLAM implementation.

Developing For IOS:
1. Download XCode if you have a Mac
2. Developing for IOS is centered around Objective-C (If you know C, picking up Objective-C will be pretty simple). Its quite easy to find C tutorials online. For example, https://learncodethehardway.org/ is a good site to look at.
3. More to come

Git Logistics & Reminders:
1. When making changes, make a new branch to add your changes
2. Naming schema: 'Initials'-'Issue#'-'ShortDescription'
3. File Issues!!!