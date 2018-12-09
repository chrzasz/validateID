This is a project for validateting number of polish ID number

Napisz program, który sprawdzi czy podany numer dowodu osobistego jest poprawny.
Numer dowodu składa się z trzech liter i sześciu cyfr, z których pierwsza jest cyfrą kontrolną czyli zależy od pozostałych.
Aby sprawdzić poprawność numeru i serii dowodu, należy najpierw zamienić litery na liczby, przypisując literom odpowiednie wartości.
Kolejnym krokiem jest wymnożenie tak uzyskanego ciągu liczb przez określone wagi. Wagi kolejnych liczb to: 7, 3, 1, 9, 7, 3, 1, 7, 3.
Reszta z dzielenia sumy iloczynów przez 10 powinna być równa 0 (zero).



Aby sprawdzić poprawność numeru i serii dowodu, należy w pierwszej kolejności zamienić litery na cyfry, przypisując literom odpowiednio:

 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35


Kolejnym krokiem jest wymnożenie tak uzyskanego ciągu liczb przez określone wagi. Wagi kolejnych liczb to: 7, 3, 1, 9, 7, 3, 1, 7, 3. Reszta z dzielenia sumy iloczynów przez 10 powinna być równa 0 (zero).

Poniżej, przykład obliczeń dla dowodu osobistego o numerze ABA300000:

Numer dowodu: A B A 3 0 0 0 0 0
Wartość: 10 11 10 3 0 0 0 0 0
Wagi: 7 3 1 9 7 3 1 7 3
Iloczyny: 70 33 10 27 0 0 0 0 0
Sumowanie: 70 + 33 + 10 + 27 + 0 + 0 + 0 + 0 + 0 = 140


Reszta z dzielenia 140 przez 10 wynosi 0 (140 mod 10 = 0), więc jest to numer poprawny.

Wagami mogą też być zestawy (1 9 3 7 1 9 3 1 9), (3 7 9 1 3 7 9 3 7), (9 1 7 3 9 1 7 9 1).