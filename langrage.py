#G1
def  lagrange_interpolation(x_values,y_values, x):

#G2
    n=len(x_values)
    result=0

    for j in range(n):
       term =y_values[j]

       for i in range(n):
             if i !=j:
               term= term*(x -x_values[i]) /(x_values[j]-x_values[i]) 
       result=result + term
    return result


#G3
x_values=[0,2,5,7]
y_values=[5,13,40,68]


#G4
answer=lagrange_interpolation(x_values,y_values,3.5 )
print("pipeline positionat x=3.5 is",answer)

#G6
for value in x_values:
    answer=lagrange_interpolation(x_values,y_values,value)
    print(value,answer)

#G7
print("estimated points",) 
test_values=[1,3,4,6]
for x in test_values:
    y=lagrange_interpolation(x_values,y_values,x)
    print((x,y))

print()
#G8

print("0.5 intervals")
x=0
while x<=7:
    y=lagrange_interpolation(x_values,y_values,x)
    print((x,y))
    x+=0.5

#G9
import matplotlib.pyplot as plt
plt.scatter(x_values, y_values)
x=0
x_points =[]
y_points =[]

while x<=7:
    y=lagrange_interpolation(x_values,y_values,x)
    x_points.append(x)
    y_points.append(y)
    x+=1

plt.plot(x_points,y_points)  
plt.xlabel("road distance")  
plt.ylabel("pipeline position")
plt.title('lagrange graph showing position of pipeline')
plt.show()

