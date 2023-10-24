import java.util.Scanner;
import java.util.ArrayList;

class Main extends FoodItem {

    //used for scanner
    private static Scanner scanner;

    public static void main(String[] args) {

      //scanner object and ArrayList created
      scanner = new Scanner(System.in);
      ArrayList<FoodItem> foodInfoList = new ArrayList<>();

      //variables
      String foodName;
      double fat;
      double carbs;
      double protein;
      int servings;
      FoodItem foodItem;

      // NEW variables
      String vegetableName;
      double totalCalories;
      double totalFiber = 0.0;
      double totalIronContent = 0.0;
      double totalVitaminC = 0.0;

      //initialize servings
      servings = 0;

      //prints beginning to program for user -- NEW
      System.out.print("\nCongratulations on choosing some vegetables! \nEnter details for a leafy green vegetable: \n");

      //vars for leafy green
      String leafyGreenName = "";
      double leafyGreenFat = 0.0;
      double leafyGreenCarbs = 0.0;
      double leafyGreenProtein = 0.0;
      double leafyGreenFiber = 0.0;
      double leafyGreenIronContent = 0.0;

      //gets leafy green name
      System.out.print("Enter the name of the vegetable: ");
      leafyGreenName = scanner.next();


      //do loop for fat
      do {
        System.out.print("Enter the amount of fat in " + leafyGreenName + "(grams): ");
        leafyGreenFat = scanner.nextDouble();
        if (leafyGreenFat < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
        }
      } while (leafyGreenFat < 0);

      //do loop for carbs
      do {
        System.out.print("Enter the amount of carbs in " + leafyGreenName + " (grams): ");
        leafyGreenCarbs = scanner.nextDouble();
        if (leafyGreenCarbs < 0) {
      System.out.println("\nNegative numbers not accepted. Try again.");
    }
      } while (leafyGreenCarbs < 0);

      //do loop for protein
      do {
    System.out.print("Enter the amount of protein in " + leafyGreenName + " (grams): ");
        leafyGreenProtein = scanner.nextDouble();
        if (leafyGreenProtein < 0) {
      System.out.println("\nNegative numbers not accepted. Try again.");
    }
      } while (leafyGreenProtein < 0);

      //do loop for fiber
      do {
        System.out.print("Enter the amount of fiber in " + leafyGreenName + " (grams): ");
        leafyGreenFiber = scanner.nextDouble();
        if (leafyGreenFiber < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
        }
      } while (leafyGreenFiber < 0);

      //do loop for iron content
      do {
        System.out.print("Enter the iron content in " + leafyGreenName + " (mg): ");
        leafyGreenIronContent = scanner.nextDouble();
        if (leafyGreenIronContent < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
        }
      } while (leafyGreenIronContent < 0);

      //do loop for servings
      do {
        System.out.print("Enter the number of servings of " + leafyGreenName + ": ");
        servings = scanner.nextInt();
        if (servings < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
        }
      } while (servings < 0);

      //create leafyGreen object, add to food item list
      LeafyGreens leafyGreen = new LeafyGreens(leafyGreenName, leafyGreenFat, leafyGreenCarbs, leafyGreenProtein, leafyGreenFiber, leafyGreenIronContent);
      foodInfoList.add(leafyGreen);


      //get details for a root vegetable -- NEW
      System.out.println("\nEnter details for a root vegetable:");
      String rootVegetableName = "";
      double rootVegetableFat  = 0.0;
      double rootVegetableCarbs  = 0.0;
      double rootVegetableProtein  = 0.0;
      double rootVegetableFiber  = 0.0;
      double rootVegetableVitaminC  = 0.0;

      //print name of veggie
      System.out.print("Enter the name of the vegetable: ");
      rootVegetableName = scanner.next();

      //do loop for fat
      do {
        System.out.print("Enter the amount of fat in " + rootVegetableName + " (grams): ");
        rootVegetableFat = scanner.nextDouble();
        if (rootVegetableFat < 0) {
      System.out.println("\nNegative numbers not accepted. Try again.");
    }
      } while (rootVegetableFat < 0);

      //do loop for carbs
      do {
        System.out.print("Enter the amount of carbs in " + rootVegetableName + " (grams): ");
        rootVegetableCarbs = scanner.nextDouble();
        if (rootVegetableCarbs < 0) {
      System.out.println("\nNegative numbers not accepted. Try again.");
    }
      } while (rootVegetableCarbs < 0);

      //do loop for protein
      do {
        System.out.print("Enter the amount of protein in " + rootVegetableName + " (grams): ");
        rootVegetableProtein = scanner.nextDouble();
        if (rootVegetableProtein < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
        }
      } while (rootVegetableProtein < 0);

      //do loop for fiber
      do {
        System.out.print("Enter the amount of fiber in " + rootVegetableName + " (grams): ");
        rootVegetableFiber = scanner.nextDouble();
        if (rootVegetableFiber < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
    }
      } while (rootVegetableFiber < 0);

      //do loop for vitamin c
      do {
        System.out.print("Enter the Vitamin C content in " + rootVegetableName + " (mg): ");
        rootVegetableVitaminC = scanner.nextDouble();
        if (rootVegetableVitaminC < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
        }
      } while (rootVegetableVitaminC < 0);

      //do loop for servings
      do {
        System.out.print("Enter the number of servings of " + rootVegetableName + ": ");
        servings = scanner.nextInt();
        if (servings < 0) {
          System.out.println("\nNegative numbers not accepted. Try again.");
        }
      } while (servings < 0);

      //create rootVegetable object, add to food item list
      RootVegetables rootVegetable = new RootVegetables(rootVegetableName, rootVegetableFat, rootVegetableCarbs, rootVegetableProtein, rootVegetableFiber, rootVegetableVitaminC);
      foodInfoList.add(rootVegetable);


      //gets the number of food items from the user
      System.out.print("\nHow many food items would you like to input? : ");
      int foodNum = scanner.nextInt();

        //for loop to get name, fat, carbs, protein, and servings
        for (int i = 0; i < foodNum; i++) {
          System.out.print("Enter the name of the food item: ");
          foodName = scanner.next();

          //fat do loop for negative input
          do{
            System.out.print("Enter the amount of fat in " + foodName + " (grams): ");
            fat = scanner.nextDouble();
            if(fat < 0){
              System.out.println("\nNegative numbers not accepted. Try again.");
            }
          } while (fat < 0);

          //carbs do loop for negative input
          do{
            System.out.print("Enter the amount of carbs in " + foodName + " (grams): ");
            carbs = scanner.nextDouble();
            if (carbs < 0){
              System.out.println("\nNegative numbers not accepted. Try again.");
            }
          } while (carbs < 0);

          //proteins do loop for negative input
          do {
            System.out.print("Enter the amount of protein in " + foodName + " (grams): ");
            protein = scanner.nextDouble();
            if (protein < 0) {
              System.out.println("\nNegative numbers not accepted. Try again.");
            }
          } while (protein < 0);

          //servings do loop for negative input
          do {
            System.out.print("Enter the number of servings for " + foodName + ": ");
            servings = scanner.nextInt();
            if (servings < 0) {
                  System.out.println("\nNegative numbers not accepted. Try again.");
            }
          } while (servings < 0);

          //FoodItem object is added to foodInfoList
          foodItem = new FoodItem(foodName, fat, carbs, protein);
          foodInfoList.add(foodItem);

          //dominant macronutrient printed for each item
          String dominantMacronutrient = foodItem.getDominantMacronutrient();
          System.out.println("Dominant Macronutrient for " + foodItem.getName() + ": " + dominantMacronutrient);
        }

      //variable for total combined calories
      double totalCombinedCalories = 0.0;

      //food item info at first is printed
      for (FoodItem item : foodInfoList) {
        System.out.println("\nNutritional information per serving of " + item.getName() + ":");
        System.out.println("Fat: " + item.getFat() + " g");
        System. out.println("Carbohydrates: " + item.getCarbs() + " g");
        System.out.println("Protein: " + item.getProtein() + " g");

  //if statement for leafy veggie info -- NEW
  //instanceof is used to make sure 'item' is an instance of the LeafyGreens class
    if (item instanceof LeafyGreens) {
        LeafyGreens leafyGreens = (LeafyGreens) item;
        System.out.println("Fiber: " + leafyGreens.getFiber() + " g");
        System.out.println("Iron Content: " + leafyGreens.getIronContent() + " mg");

      //finds dominant micronutrient for leafy veggie
      String dominantMacronutrient = leafyGreens.getDominantMacronutrient();
      System.out.println("Dominant Macronutrient: " + dominantMacronutrient);

      //used in finding total fiber
      double fiber = leafyGreens.getFiber();
      totalFiber += fiber;

      //used in finding total iron content
      double ironContent = leafyGreen.getIronContent();
      totalIronContent += ironContent;

      //else if for root veggie info -- NEW
    } else if (item instanceof RootVegetables) {
      RootVegetables rootVegetables = (RootVegetables) item;
      System.out.println("Fiber: " + rootVegetables.getFiber() + " g");
      System.out.println("Vitamin C Content: " + rootVegetables.getVitaminC() + " mg");

      //finds dominant micronutrient for root veggie
      String dominantMacronutrient = rootVegetables.getDominantMacronutrient();
        System.out.println("Dominant Macronutrient: " + dominantMacronutrient);

      //used in finding total fiber
      double fiber = rootVegetables.getFiber();
      totalFiber += fiber;

      //used in finding total vitamin c
      double vitaminC = rootVegetables.getVitaminC();
      totalVitaminC += vitaminC;
    }

  //total combined calories
    double totalCals = (item.calculateFat() + item.calculateCarbs() + item.calculateProtein()) * servings;
    totalCals *= servings;

    System.out.print("Total Calories for " + servings + " servings of " + item.getName() + ": " + totalCals);
    totalCombinedCalories += totalCals;

        //used to separate each "nutritional info" category
        System.out.println();
}

      //check if current dominant macronutrient is equal or not, loop through foodInfoList, update if not equal
      String dominantMacronutrient = "Equal";
      for (int i = 1; i < foodInfoList.size(); i++) {
        String currentDom = foodInfoList.get(i).getDominantMacronutrient();
        if (!currentDom.equals("Equal")) {
          dominantMacronutrient = currentDom;
        }
      }

      //prints calories for all items
      System.out.println("\nTotal combined calories for all food items: " + totalCombinedCalories);

      //prints fiber for all items
      System.out.println("Total combined fiber for all food items: " + totalFiber);

      //prints iron content for all items
      System.out.println("Total combined iron content for all food items: " + totalIronContent);

      //print vitamin c content for all items
      System.out.println("Total combined vitamin c content for all food items: " + totalVitaminC);

      //ending print
      System.out.println("\nThank you for using the Nutrition Information System!");
    }
}