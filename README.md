# insertion sort 

[22,27,16,2,18,6] > Başlangıç

- Adım Bir [2,22,27,16,18,6] O(n)
- Adım İki [2,6,22,27,16,18] O(n-1)
- Adım Üç [2,6,16,22,27,18] O(n-3)
- Adım Dört [2,6,16,18,22,27] bitiş

Bu adımlara göre 1'den n'e kadar olan sayıların toplamı;

- __n*(n+1)/2 = (n^2 + n)/2__ 

Dominant faktör **n^2** olduğu için Big O Nation = O(n^2).

- 18 sayısı Avarage Case kapsamına girer çünkü sonda değildir

-------------------------

[7,3,5,8,2,9,4,15,6] > Başlangıç

- Adım Bir [2,7,3,5,8,2,9,4,25,6]
- Adım İki [2,3,7,5,8,9,4,15,6]
- Adım Üç [2,3,4,7,5,8,9,15,6]
- Adım Dört [2,3,4,5,7,8,9,16,6]

