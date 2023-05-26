# Roman Numerals (Java Version)

The Roman numeral system (Roman Numerals) was developed in Ancient Rome and was used throughout its Empire. In this system the figures are written with certain letters, which represent the numbers. The letters are always capitalized, as in the Roman alphabet there are no lowercase letters, the letters are I, V, X, L, C, D and M.

This project's didactic objective is to develop a solution to convert Indo-Arabic numbers to Roman format and vice versa. The rules for forming Roman numerals are given below.

Each letter corresponds to a certain value:

    I = 1
    V = 5
    X = 10
    L = 50
    C = 100
    D = 500
    M = 1000

By grouping the letters above, we can represent the numbers according to a set of rules:

- With the exception of V, L and D, the other numerals can be repeated a maximum of three times:

    
    III = 3
    XXX = 30
    CCC = 300
    MMM = 3000


- When written to the right of larger numerals, I, X and C add to the values of the first ones:


    VIII = 5 + 1 + 1 + 1 = 8
    LXII = 50 + 10 + 1 + 1 = 62
    CLVIII = 158
    MCXX = 1000 + 100 + 10 + 10 = 1120

- But if the numerals I, X and C are to the left of the larger ones, their values are subtracted as, for example, in:


    IV = 5 - 1 = 4
    IX = 10 - 1 = 9
    XC = 100 - 10 = 90