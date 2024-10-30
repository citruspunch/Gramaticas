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