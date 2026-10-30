import random
secretnumber =random.randint(1,100)
guess=0
attempts=0
while guess!=secretnumber and attempts<5:

      guess=int(input("entere your guess: "))
      attempts+=1
      if guess==secretnumber:
        print("you got it")
      elif guess>secretnumber:
        print("too high")
      else:print("too low")

if guess==secretnumber:
   print("you won in ",attempts,"attempts")
else:
   print("game over")

