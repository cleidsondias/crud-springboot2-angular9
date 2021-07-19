DROP TABLE IF EXISTS TBVEICULOS ;

CREATE TABLE TBVEICULOS  (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  ANO INT NOT NULL,
  MARCA VARCHAR(30) NOT NULL, 
  VEICULO VARCHAR(250) NOT NULL,
  DESCRICAO TEXT,
  VENDIDO BOOLEAN
);

INSERT INTO TBVEICULOS (ANO, MARCA, VEICULO, DESCRICAO, VENDIDO) VALUES
  (2001, 'CHEVROLET', 'CELTA', 'COM KIT APARENCIA', TRUE),
  (1998, 'CHEVROLET', 'CORSA', 'VERDE METALICO', FALSE),
  (2012, 'HONDA', 'CIVIC', 'COM CENTRAL MULTIMIDIA', FALSE),
  (2003, 'CITROEN', 'XSARA PICASSO', 'PRETO ONIX', TRUE),
  (2005, 'PEUGEOUT', '206', 'CINZA', TRUE),
  (2015, 'FIAT', 'FREMONT', 'PRETO', FALSE),
  (2001, 'VOLKSWAGEN', 'GOL', 'VERMELHO', TRUE);