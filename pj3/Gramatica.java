# start of generated code
  .data
  .align  2
  .globl  class_nameTab
  .globl  Main_protObj
  .globl  Int_protObj
  .globl  String_protObj
  .globl  bool_const0
  .globl  bool_const1
  .globl  _int_tag
  .globl  _bool_tag
  .globl  _string_tag
_int_tag:
  .word   2
_bool_tag:
  .word   3
_string_tag:
  .word   4
  .globl  _MemMgr_TEST
_MemMgr_TEST:
  .word   0
str_const13:
  .word   4
  .word   5
  .word   String_dispTab
  .word   int_const1
  .byte  0
  .align  2
str_const12:
  .word   4
  .word   6
  .word   String_dispTab
  .word   int_const3
  .ascii  "Main"
  .byte  0
  .align  2
str_const11:
  .word   4
  .word   5
  .word   String_dispTab
  .word   int_const4
  .ascii  "B"
  .byte  0
  .align  2
str_const10:
  .word   4
  .word   5
  .word   String_dispTab
  .word   int_const4
  .ascii  "A"
  .byte  0
  .align  2
str_const9:
  .word   4
  .word   6
  .word   String_dispTab
  .word   int_const5
  .ascii  "String"
  .byte  0
  .align  2
str_const8:
  .word   4
  .word   6
  .word   String_dispTab
  .word   int_const3
  .ascii  "Bool"
  .byte  0
  .align  2
str_const7:
  .word   4
  .word   5
  .word   String_dispTab
  .word   int_const2
  .ascii  "Int"
  .byte  0
  .align  2
str_const6:
  .word   4
  .word   5
  .word   String_dispTab
  .word   int_const6
  .ascii  "IO"
  .byte  0
  .align  2
str_const5:
  .word   4
  .word   6
  .word   String_dispTab
  .word   int_const5
  .ascii  "Object"
  .byte  0
  .align  2
str_const4:
  .word   4
  .word   7
  .word   String_dispTab
  .word   int_const7
  .ascii  "_prim_slot"
  .byte  0
  .align  2
str_const3:
  .word   4
  .word   7
  .word   String_dispTab
  .word   int_const8
  .ascii  "SELF_TYPE"
  .byte  0
  .align  2
str_const2:
  .word   4
  .word   7
  .word   String_dispTab
  .word   int_const8
  .ascii  "_no_class"
  .byte  0
  .align  2
str_const1:
  .word   4
  .word   8
  .word   String_dispTab
  .word   int_const9
  .ascii  "<basic class>"
  .byte  0
  .align  2
str_const0:
  .word   4
  .word   7
  .word   String_dispTab
  .word   int_const7
  .ascii  "example.cl"
  .byte  0
  .align  2
int_const9:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   13
int_const8:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   9
int_const7:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   10
int_const6:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   2
int_const5:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   6
int_const4:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   1
int_const3:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   4
int_const2:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   3
int_const1:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   0
int_const0:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   5
bool_const0:
  .word   3
  .word   4
  .word   Bool_dispTab
  .word   0
bool_const1:
  .word   3
  .word   4
  .word   Bool_dispTab
  .word   1
class_nameTab:
  .word   str_const5
  .word   str_const6
  .word   str_const7
  .word   str_const8
  .word   str_const9
  .word   str_const10
  .word   str_const11
  .word   str_const12
class_objTab:
  .word   Object_protObj
  .word   Object_init
  .word   IO_protObj
  .word   IO_init
  .word   Int_protObj
  .word   Int_init
  .word   Bool_protObj
  .word   Bool_init
  .word   String_protObj
  .word   String_init
  .word   A_protObj
  .word   A_init
  .word   B_protObj
  .word   B_init
  .word   Main_protObj
  .word   Main_init
Object_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
IO_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
  .word   IO.out_string
  .word   IO.out_int
  .word   IO.in_string
  .word   IO.in_int
Int_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
Bool_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
String_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
  .word   String.length
  .word   String.concat
  .word   String.substr
A_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
  .word   A.foo
B_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
  .word   A.foo
Main_dispTab:
  .word   Object.abort
  .word   Object.type_name
  .word   Object.copy
  .word   Main.main
Object_protObj:
  .word   0
  .word   3
  .word   Object_dispTab
IO_protObj:
  .word   1
  .word   3
  .word   IO_dispTab
Int_protObj:
  .word   2
  .word   4
  .word   Int_dispTab
  .word   0
Bool_protObj:
  .word   3
  .word   4
  .word   Bool_dispTab
  .word   0
String_protObj:
  .word   4
  .word   5
  .word   String_dispTab
  .word   int_const1
  .word   0
A_protObj:
  .word   5
  .word   4
  .word   A_dispTab
  .word   int_const1
B_protObj:
  .word   6
  .word   3
  .word   B_dispTab
Main_protObj:
  .word   7
  .word   3
  .word   Main_dispTab
  .globl  heap_start
heap_start:
  .word   0
  .text
  .globl  Main_init
  .globl  Int_init
  .globl  String_init
  .globl  Bool_init
  .globl  Main.main
Object_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
IO_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  jal   Object_init
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
Int_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  jal   Object_init
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
Bool_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  jal   Object_init
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
String_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  jal   Object_init
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
A_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  jal   Object_init
  la    a0 int_const0
  sw    a0 12(s0)
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
B_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  jal   A_init
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
Main_init:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0
  jal   Object_init
  mv    a0 s0
  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 12
  ret   
A.foo:
  addi  sp sp -12
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0

  lw    a0 12(tp)
  sw    a0 12(s0)
  lw    a0 -4(tp)

  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 16
  ret   
Main.main:
  addi  sp sp -20
  sw    tp 12(sp)
  sw    s0 8(sp)
  sw    ra 4(sp)
  addi  tp sp 4
  mv    s0 a0

  la    a0 B_protObj
  jal   Object.copy
  jal   B_init
  sw    a0 16(tp)
  lw    a0 16(tp)
  sw    a0 0(sp)
  addi  sp sp -4
  lw    a0 16(tp)
  lw    t1 4(sp)
  addi  sp sp 4
  mv    t2 a0
  la    a0 bool_const1
  beq   t1 t2 label0
  la    a1 bool_const0
  jal   equality_test
label0:
  lw    t1 12(a0)
  beqz  t1 label1
  la    a0 int_const1
  j     label2
label1:
  mv    a0 s0
  bne   a0 x0 label3
  la    a0 str_const0
  li    t1 1
  jal   _dispatch_abort
label3:
  lw    t1 8(a0)
  lw    t1 0(t1)
  jalr  t1
label2:
  lw    a0 16(tp)
  sw    a0 0(sp)
  addi  sp sp -4
  la    a0 B_protObj
  jal   Object.copy
  jal   B_init
  lw    t1 4(sp)
  addi  sp sp 4
  mv    t2 a0
  la    a0 bool_const1
  beq   t1 t2 label4
  la    a1 bool_const0
  jal   equality_test
label4:
  lw    t1 12(a0)
  beqz  t1 label5
  mv    a0 s0
  bne   a0 x0 label6
  la    a0 str_const0
  li    t1 1
  jal   _dispatch_abort
label6:
  lw    t1 8(a0)
  lw    t1 0(t1)
  jalr  t1
  j     label7
label5:
  la    a0 int_const1
label7:
  la    a0 A_protObj
  jal   Object.copy
  jal   A_init
  sw    a0 0(sp)
  addi  sp sp -4
  la    a0 A_protObj
  jal   Object.copy
  jal   A_init
  lw    t1 4(sp)
  addi  sp sp 4
  mv    t2 a0
  la    a0 bool_const1
  beq   t1 t2 label8
  la    a1 bool_const0
  jal   equality_test
label8:
  lw    t1 12(a0)
  beqz  t1 label9
  mv    a0 s0
  bne   a0 x0 label10
  la    a0 str_const0
  li    t1 1
  jal   _dispatch_abort
label10:
  lw    t1 8(a0)
  lw    t1 0(t1)
  jalr  t1
  j     label11
label9:
  la    a0 int_const1
label11:
  lw    a0 16(tp)
  sw    a0 16(tp)
  lw    a0 16(tp)
  sw    a0 0(sp)
  addi  sp sp -4
  lw    a0 16(tp)
  lw    t1 4(sp)
  addi  sp sp 4
  mv    t2 a0
  la    a0 bool_const1
  beq   t1 t2 label12
  la    a1 bool_const0
  jal   equality_test
label12:
  lw    t1 12(a0)
  beqz  t1 label13
  la    a0 int_const1
  j     label14
label13:
  mv    a0 s0
  bne   a0 x0 label15
  la    a0 str_const0
  li    t1 1
  jal   _dispatch_abort
label15:
  lw    t1 8(a0)
  lw    t1 0(t1)
  jalr  t1
label14:
  la    a0 int_const2
  sw    a0 0(sp)
  addi  sp sp -4
  lw    a0 16(tp)
  bne   a0 x0 label16
  la    a0 str_const0
  li    t1 1
  jal   _dispatch_abort
label16:
  lw    t1 8(a0)
  lw    t1 12(t1)
  jalr  t1
  sw    a0 0(sp)
  addi  sp sp -4
  lw    a0 16(tp)
  lw    t1 4(sp)
  addi  sp sp 4
  mv    t2 a0
  la    a0 bool_const1
  beq   t1 t2 label17
  la    a1 bool_const0
  jal   equality_test
label17:
  lw    t1 12(a0)
  beqz  t1 label18
  la    a0 int_const1
  j     label19
label18:
  mv    a0 s0
  bne   a0 x0 label20
  la    a0 str_const0
  li    t1 1
  jal   _dispatch_abort
label20:
  lw    t1 8(a0)
  lw    t1 0(t1)
  jalr  t1
label19:
  mv    a0 x0
  sw    a0 16(tp)
  mv    a0 x0
  sw    a0 20(tp)
  lw    a0 16(tp)
  sw    a0 0(sp)
  addi  sp sp -4
  lw    a0 20(tp)
  lw    t1 4(sp)
  addi  sp sp 4
  mv    t2 a0
  la    a0 bool_const1
  beq   t1 t2 label21
  la    a1 bool_const0
  jal   equality_test
label21:
  lw    t1 12(a0)
  beqz  t1 label22
  la    a0 int_const1
  j     label23
label22:
  mv    a0 s0
  bne   a0 x0 label24
  la    a0 str_const0
  li    t1 1
  jal   _dispatch_abort
label24:
  lw    t1 8(a0)
  lw    t1 0(t1)
  jalr  t1
label23:

  lw    tp 12(sp)
  lw    s0 8(sp)
  lw    ra 4(sp)
  addi  sp sp 20
  ret   

# end of generated code
