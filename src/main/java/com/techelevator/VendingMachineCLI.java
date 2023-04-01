package com.techelevator;

import com.techelevator.view.Menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };

	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION_FEED_MONEY,PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};


	private Menu menu;

	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	private Calculator calculator = new Calculator();
	private Currency currency = new Currency();
	Log log = new Log();

	public void run() {
		File actionLog = new File("java-yellow-minicapstonemodule1-team6");
		InventoryReader.buildInventory();
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			//Display list
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				InventoryReader.displayInventory(InventoryReader.getInventoryItemMap());

			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				// do purchase
				System.out.println();
				System.out.println("Current Money Provided: $"+ calculator.getCurrentMoneyProvided());
				String purchaseMenuChoice = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
				if(purchaseMenuChoice.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {

					System.out.println("Current Money Provided: $" + calculator.getCurrentMoneyProvided().doubleValue());
					System.out.println("Insert Money or Press x to return Purchase Menu");
					Scanner scanner = new Scanner(System.in);
					String moneyInput = scanner.nextLine();
					while (!moneyInput.equals("x")) {
						BigDecimal moneyInputDouble = new BigDecimal(moneyInput);
						calculator.setCurrentMoneyProvided(calculator.getCurrentMoneyProvided(), moneyInputDouble, false);
						System.out.println("Current Money Provided: $" + calculator.getCurrentMoneyProvided());
						System.out.println("Insert Money or Press x to return Purchase Menu");
						moneyInput = scanner.nextLine();

					}
				}
				if (purchaseMenuChoice.equals(PURCHASE_MENU_OPTION_SELECT_PRODUCT)) {
					InventoryReader.displayInventory(InventoryReader.getInventoryItemMap());
					System.out.println();
					System.out.println("What would you like to buy?");
					Scanner scanner = new Scanner(System.in);
					String userSelection = scanner.nextLine();
					if (InventoryReader.getInventoryItemMap().get(userSelection).getPrice().compareTo(calculator.getCurrentMoneyProvided()) < 0) {
						InventoryItem.purchaseItem(InventoryReader.getInventoryItemMap(), calculator.getCurrentMoneyProvided(), userSelection);
						calculator.setCurrentMoneyProvided(calculator.getCurrentMoneyProvided(), InventoryReader.getInventoryItemMap().get(userSelection).getPrice(), true);
					} else {
						System.out.println();
						System.out.println("Not enough money, please insert more");
					}
					}
				if (purchaseMenuChoice.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)) {
					currency.returnChange(calculator.getCurrentMoneyProvided());
				}

			} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				// exit
			}
		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
