.model small
.code
main proc

    input:
    mov ah, 1
    int 21h

    cmp al, '0'
    jb quit
    cmp al, '9'
    ja quit

    mov bl, al
    int 21h

    cmp al, '0'
    jb quit
    cmp al, '9'
    ja quit

    mov bh, al
    sub bh, bl
    jns output
    neg bh

    output:
    mov ah, 2
    mov dl, 0ah
    int 21h
    mov dl, 0dh
    int 21h

    mov dl, bh
    add dl, 30h
    int 21h
    jmp input

    quit:
    mov ah, 4ch
    int 21h

main endp
end main