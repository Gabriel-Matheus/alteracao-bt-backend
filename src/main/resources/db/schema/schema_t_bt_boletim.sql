CREATE TABLE T_BT_BOLETIM (
    ID_BOLETIM NUMBER(5) NOT NULL PRIMARY KEY,
    NR_BOLETIM NUMBER(4) NOT NULL,
    CD_PROJETO VARCHAR2(2) NOT NULL,
    NR_BT_PROJETO NUMBER(4) NOT NULL,
    NR_ANO NUMBER(4) NOT NULL,
    NR_REVISAO NUMBER(3) NOT NULL,
    DT_REVISAO DATE NOT NULL,
    CD_MATERIAL NUMBER(12) NOT NULL,
    DT_IMPLANTACAO DATE,
    TX_MOTIVO_REVISAO VARCHAR2(4000),
    TX_REQUER_VOO VARCHAR2(1),
    CD_SITUACAO VARCHAR2(1),
    DT_INSERT DATE,
    NM_USER_INSERT VARCHAR2(30),
    DT_UPDATE DATE,
    NM_USER_UPDATE VARCHAR2(30),
    ID_PROPOSTA NUMBER(7)
);