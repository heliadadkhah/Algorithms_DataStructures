-- U01
Evis Bregu
Brisilda Cekreci
Helia Dadkhah
--

run in the Terminal:
`make`

test with 20 millions elements (takes time):
`make Main TEST0`

whether program works for smaller size of input(100):
`make Main TEST1`
also prints number of comparisons

testing for various values of b (threshold)in range[10,200] on the same array each time:
`make Main TEST2`

testing for various values of b (threshold )in range (0, 50, 5) on different datasets:
`make Main TEST3`
the output will be stored on a file called documentation.txt (it has been already tested and stored)