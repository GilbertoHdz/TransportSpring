package mx.manitos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mx.manitos.entity.Category;
import mx.manitos.repository.CategoryRepository;
import mx.manitos.transformer.TransformerClass;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepo;
	
	public List<Category> findAllCategories() {
		// TODO Auto-generated method stub
		List<Category> list = categoryRepo.findAll();
		return list;
	}

	public List<TransformerClass> findAllTransformer() {
		// TODO Auto-generated method stub
		List<TransformerClass> list = categoryRepo.findAllTransformer();
		return list;
	}

}
