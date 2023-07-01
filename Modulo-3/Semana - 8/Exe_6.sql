CREATE OR REPLACE TRIGGER beforeDeletePrecoProduto
BEFORE DELETE ON PRECOPRODUTO
FOR EACH ROW
BEGIN
    INSERT INTO LOG (ID, Campo, ValorAntigo, NomeTabela)
    VALUES (:OLD.ID, 'IDPRODUTO', :OLD.IDProduto, 'PrecoProduto');
END;