import time
import random
import threading
import math
def thisFunctionPrintTables():
    randomTableNumber = math.floor(random.uniform(1,11))
    for i in range(1, 11):

        print(f"{randomTableNumber} X {i} = {randomTableNumber * i}")



def random_timer(executionNumber):
    for n in range (executionNumber):
        delay = math.floor(random.uniform(0, 10))
        print(f"next table will be printed after {delay} seconds")
        time.sleep(delay)
        thisFunctionPrintTables()


thisFunctionPrintTables()
executionNumber = 10;
thread = threading.Thread(target=random_timer, args=(executionNumber,))
thread.start()

