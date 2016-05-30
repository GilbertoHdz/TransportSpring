package mx.manitos.repository;

import java.util.List;

import mx.manitos.entity.Category;
import mx.manitos.transformer.TransformerClass;

public interface CategoryRepository {
	
	List<Category> findAll();
	
	List<TransformerClass> findAllTransformer();
	
}
