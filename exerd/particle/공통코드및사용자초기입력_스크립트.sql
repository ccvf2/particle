INSERT
INTO TBL_MEM(MEM_SEQ, MEM_NAME,  MEM_NICKNAME, MEM_ID, MEM_INFO,  MEM_TYPE ) VALUES ( SEQ_MEM.NEXTVAL, '������',  'administrator', 'admin', 'C0001', 'M0001' );
  
  

  
  --ȸ�������ڵ尪------------------------------------------------------------
  INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'M0001', '������','M0000','ȸ������', '0',1);
  
    INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'M0002', '�Ϲ�����','M0000','ȸ������', '1',2);
  
  
  
--����������ڵ尪------------------------------------------------------------
      INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'C0001', '���̹�','C0000','������', '���̹�',1);
  
        INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'C0002', '����','C0000','������', '����',2);
  
  
  
  commit;