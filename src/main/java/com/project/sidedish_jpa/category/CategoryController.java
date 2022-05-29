package com.project.sidedish_jpa.category;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CategoryController {

	private final CategoryRepository categoryRepository;

	@GetMapping("/category/{categoryId}")
	public List<Category> findSubByParentId(@PathVariable Long categoryId) {
		return categoryRepository.findSubCategoryIdByParentId(categoryId);
	}
}
