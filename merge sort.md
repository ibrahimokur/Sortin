# Merge Sort 
----------------------
 [16,21,11,8,12,22] > Başlangıç

 - Birini Adım [16,21,11] - [8,12,22] > o(n)
 - İkinci Adım [16,21] [11] - [8,12,] [22] > o(n)
 - Üçüncü Adın [16] [21] [11] - [8] [12] [22] > o(n)
 - Dördüncü Adım [16,21] [11] [8,12,] [22] > o(n)
 - Beşinci Adım [11,16,21] [8,12,22] > o(n)
 - Altıncı Adım [8,11,12,16,21,22] > o(n)

 Bu adımlara bakarak sonucun __2^x = n__ o da bize __logn = x__ sonucunu verecektir.
 
 - Big O Time logn