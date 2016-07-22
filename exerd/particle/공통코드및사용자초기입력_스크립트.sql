INSERT
INTO TBL_MEM(MEM_SEQ, MEM_NAME,  MEM_NICKNAME, MEM_ID, MEM_INFO,  MEM_TYPE ) VALUES ( SEQ_MEM.NEXTVAL, '관리자',  'administrator', 'admin', 'C0001', 'M0001' );
  
  

  
  --회원공통코드값------------------------------------------------------------
  INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'M0001', '관리자','M0000','회원레벨', '0',1);
  
    INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'M0002', '일반유저','M0000','회원레벨', '1',2);
  
  
  
--인증사공통코드값------------------------------------------------------------
      INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'C0001', '네이버','C0000','인증사', '네이버',1);
  
        INSERT INTO TBL_code
  (CODE_SEQ,CODE,CODE_NAME,CODE_GROUP,CODE_GROUP_NAME,CODE_VALUE,CODE_SORT)
  VALUES
  (SEQ_code.NEXTVAL, 'C0002', '다음','C0000','인증사', '다음',2);
  
  
  
  commit;