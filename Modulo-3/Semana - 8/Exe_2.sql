CREATE OR REPLACE VIEW ApenasLeituraProdutoPreco AS
SELECT ID, IDPRODUTO
FROM PRECOPRODUTO
WITH READ ONLY;