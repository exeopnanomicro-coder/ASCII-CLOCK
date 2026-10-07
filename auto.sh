#!/bin/bash
echo -ne "\e[8;41;131t"
stty cols 131 rows 41 2>/dev/null
clear

cd "/home/aziensama/Documents/Projects/complated/Clock complated"
java -cp . clock
