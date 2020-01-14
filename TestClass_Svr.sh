#!/bin/sh
rm output?.txt > /dev/null 2>&1
TestPath=/home/k.l.tam/CW2Svr/input
ResultPath=/home/k.l.tam/CW2Svr/result
timeout 10 java -cp . -Xmx300m TestClass 2     ${TestPath}/Input1.bin > Output1.txt
timeout 10 java -cp . -Xmx300m TestClass 101   ${TestPath}/Input2.bin > Output2.txt
timeout 10 java -cp . -Xmx300m TestClass 503   ${TestPath}/Input3.bin > Output3.txt
timeout 10 java -cp . -Xmx300m TestClass 1000  ${TestPath}/Input4.bin > Output4.txt
timeout 10 java -cp . -Xmx300m TestClass 1000  ${TestPath}/Input5.bin > Output5.txt
timeout 10 java -cp . -Xmx300m TestClass 2000  ${TestPath}/Input6.bin > Output6.txt
timeout 10 java -cp . -Xmx300m TestClass 10000 ${TestPath}/Input7.bin > Output7.txt
diff --ignore-all-space --brief ${ResultPath}/Result1.txt Output1.txt
diff --ignore-all-space --brief ${ResultPath}/Result2.txt Output2.txt
diff --ignore-all-space --brief ${ResultPath}/Result3.txt Output3.txt
diff --ignore-all-space --brief ${ResultPath}/Result4.txt Output4.txt
diff --ignore-all-space --brief ${ResultPath}/Result5.txt Output5.txt
diff --ignore-all-space --brief ${ResultPath}/Result6.txt Output6.txt
diff --ignore-all-space --brief ${ResultPath}/Result7.txt Output7.txt
