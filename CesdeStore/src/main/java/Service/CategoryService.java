package Service;

import domain.Category;
import interfaz.CategoryView;
import repository.CategoryRepository;

public class CategoryService {

    Category category;
    public CategoryService(Category category){
        this.category = category;
    }

    public static void createCategory(Category category){

        CategoryRepository.createCategory(category);

    }


}
