(1 until 10) flatMap (i =>
  (1 until i) filter(j => j<i) map
    (j => (i,j)))

for{
  i <- 1 until 10
  j <- 1 until i
  if (j<i)
}yield (i,j)

val a = List(1,2,3)
for{
  i <- a
} yield (i*2)

a.map(i=>i*2)