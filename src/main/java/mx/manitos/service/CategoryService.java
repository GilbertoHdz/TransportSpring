package mx.manitos.service;

import java.util.List;

import mx.manitos.entity.Category;
import mx.manitos.transformer.TransformerClass;

public interface CategoryService {
	
	List<Category> findAllCategories();
	

	List<TransformerClass> findAllTransformer();
	
}
