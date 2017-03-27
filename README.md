# Combination-Lock
This program simulates a lock combination of 3 numbers. </br>
The lock is constructed with a combination of three numbers between 0 and 39 (39 is represented by constant called MAX_VALUE).</br> 
The lock opens if the user first turned its dial right to the first number in the combination, then left to the second ,</br> 
and then right to the third number in the combination. For example if the lock combination is 1 2 3, to open it after the </br>
dial has been reset to 0 we must turn the dial 1 time to the right, 39 times to the left,  and 1 time to the right.</br>
</br>
Enter 3 positive integers separated by spaces representing the combination lock (i.e. 8 13 14)</br>
1 2 3</br>
The dial is set to 0 with combination of:  0  0  0</br>
 The lock combination is  1  2  3</br>
Enter tick values to open the lock (i.e. 9 right 1 left 23 right)</br>
1 right 2 left 3 right</br>
Turning the dial 1 times to the right, 2 times to the left, 3 times to the right </br>
The dial is set to 2 with combination of:  1  39  2</br>
 The lock combination is  1  2  3</br>
</br>
Wrong sequence, resetting the dial to 0. Try again!</br>
</br>
Enter tick values to open the lock (i.e. 9 right 1 left 23 right)</br>
1 right 39 left 1 right</br>
Turning the dial 1 times to the right, 39 times to the left, 1 times to the right </br>
The dial is set to 3 with combination of:  1  2  3</br>
 The lock combination is  1  2  3</br>
</br>
The lock has been open!</br>
</br>
Testing equals method</br>
lock1 and lock2 are the same - CORRECT</br>
