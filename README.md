#This is a project for validating polish numbers


##1. polish ID number

Napisz program, który sprawdzi czy podany numer dowodu osobistego jest poprawny.
Numer dowodu składa się z trzech liter i sześciu cyfr, z których pierwsza jest cyfrą kontrolną czyli zależy od pozostałych.
Aby sprawdzić poprawność numeru i serii dowodu, należy najpierw zamienić litery na liczby, przypisując literom odpowiednie wartości.
Kolejnym krokiem jest wymnożenie tak uzyskanego ciągu liczb przez określone wagi. Wagi kolejnych liczb to: 7, 3, 1, 9, 7, 3, 1, 7, 3.
Reszta z dzielenia sumy iloczynów przez 10 powinna być równa 0 (zero).

Aby sprawdzić poprawność numeru i serii dowodu, należy w pierwszej kolejności zamienić litery na cyfry, przypisując literom odpowiednio:
```
 A  B  C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35
```

Kolejnym krokiem jest wymnożenie tak uzyskanego ciągu liczb przez określone wagi. Wagi kolejnych liczb to: 7, 3, 1, 9, 7, 3, 1, 7, 3. Reszta z dzielenia sumy iloczynów przez 10 powinna być równa 0 (zero).

Poniżej, przykład obliczeń dla dowodu osobistego o numerze ABA300000:
```
Numer dowodu: A B A 3 0 0 0 0 0
Wartość: 10 11 10 3 0 0 0 0 0
Wagi: 7 3 1 9 7 3 1 7 3
Iloczyny: 70 33 10 27 0 0 0 0 0
Sumowanie: 70 + 33 + 10 + 27 + 0 + 0 + 0 + 0 + 0 = 140
```

Reszta z dzielenia 140 przez 10 wynosi 0 (140 mod 10 = 0), więc jest to numer poprawny.

Wagami mogą też być zestawy (1 9 3 7 1 9 3 1 9), (3 7 9 1 3 7 9 3 7), (9 1 7 3 9 1 7 9 1).



##2. PESEL number

PESEL jest to skrót od nazwy "Powszechny Elektroniczny System Ewidencji Ludności". Jest to podstawowy rejestr ewidencji ludności w Polsce, a także numer ewidencyjny osoby fizycznej wykorzystywany w tym rejestrze.

Każda osoba w Polsce posiada swój unikatowy numer jednoznacznie identyfikujący osobę fizyczną.

Numer PESEL składa się z 11 cyfr w których znajdują się następujące dane:

  * zakodowana data urodzenia,
  * liczba porządkowa w rejestrze,
  * zakodowana płeć,
  * cyfra kontrolna.

****Zakodowana data urodzenia:****

W numerze PESEL datę urodzenia zapisujemy w następujący sposób: dwie ostatnie cyfry roku, dwucyfrowy zapis numeru miesiąca i dwucyfrowy zapis numeru dnia. Po roku dwutysięcznym pojawił się problem, gdyż było niebezpieczeństwo powtórzenia zapisu cyfrowego dla ludzi urodzonych blisko 100 lat temu. Aby rozwiązać ten problem postanowiono wprowadzić nową metodę kodowania rozwiązująca problem kompleksowo:

  * dla osób urodzonych w latach 1900 do 1999: miesiąc zapisywany jest w sposób naturalny,
  * dla osób urodzonych w innych latach niż 1900 do 1999: w ich przypadku do numeru miesiąca dodawane są następujące wartości:
  * dla lat 1800-1899: dodajemy 80,
  * dla lat 2000-2099: dodajemy 20,
  * dla lat 2100-2199: dodajemy 40,
  * dla lat 2200-2299: dodajemy 60.

Taki sposób zapisu pozwala na bezproblemowy zapis daty urodzenia na przestrzeni pięciu stuleci.
Kolejne miesiące w poszczególnych stuleciach mają następujące numery:
```
Miesiąc	Stulecie
1800 – 1899	1900 – 1999	2000 – 2099	2100 – 2199	2200 – 2299
Styczeń	81	01	21	41	61
Luty	82	02	22	42	62
Marzec	83	03	23	43	63
Kwiecień	84	04	24	44	64
Maj	85	05	25	45	65
Czerwiec	86	06	26	46	66
Lipiec	87	07	27	47	67
Sierpień	88	08	28	48	68
Wrzesień	89	09	29	49	69
Październik	90	10	30	50	70
Listopad	91	11	31	51	71
Grudzień	92	12	32	52	72
```
Dla przykładu osoba urodzona 15 lipca 2003 roku ma następujący zapis w numerze ewidencyjnym:
0 2 2 7 15