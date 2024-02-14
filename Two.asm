.MODEL SMALL
.STACK 100H

.DATA
    X DB ?
    Y DB ?
    SUM DB ?

.CODE
MAIN PROC
    MOV AX, @DATA
    MOV DS, AX

    ; Read value of x from the user
    MOV AH, 01H    ; Function to read character with echo
    INT 21H        ; DOS interrupt to read character
    SUB AL, '0'    ; Convert ASCII to numerical value
    MOV X, AL      ; Store the value of x

    ; Read value of y from the user
    MOV AH, 01H    ; Function to read character with echo
    INT 21H        ; DOS interrupt to read character
    SUB AL, '0'    ; Convert ASCII to numerical value
    MOV Y, AL      ; Store the value of y

    ; Calculate the sum of x and y
    MOV AL, X      ; Move value of x into AL
    ADD AL, Y      ; Add value of y to AL
    MOV SUM, AL    ; Store the result in SUM

    ; Display the result
    MOV AH, 02H    ; Function to display character
    MOV DL, SUM    ; Load the result from SUM
    ADD DL, '0'    ; Convert numerical value to ASCII
    INT 21H        ; DOS interrupt to display character

    ; Exit the program
    MOV AH, 4CH    ; Function to terminate program
    INT 21H        ; DOS interrupt to terminate program

MAIN ENDP

END MAIN
