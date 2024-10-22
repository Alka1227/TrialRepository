import time
import socket
import sys
import os

#initialize to socket
s = socket.socket()


#initialize the host
host = socket.gethostname ()

#init the port
port = 8080

#bind the socket with port and host
s.bind (("",port))

print ("waiting for connections ...")

#listening for connections
s.listen()

#accepting the incoming connections
conn, addr = s.accept ()

print (addr, "is connected to host")

#take command as input

command = input (str("Enter command: "))

conn.send(command.enconde())

print ("Command has been sent successfully")

#recive the confirmation 
data = conn.recv (1024)

if data :
    print ("Command recivde and executed successfully")