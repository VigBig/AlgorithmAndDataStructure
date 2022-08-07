package com.bridgelabz.algorithmanddatastucture;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean menuAgain = true;
        boolean askToAddElement = true;
        boolean askToInsertElement = true;
        boolean askToDeleteElement = true;
        OrderedLinkedList<Integer> orderedLinkedList = new OrderedLinkedList<>();

        start:
        while(menuAgain){
            System.out.println("Welcome to Ordered LinkedList Program");
            System.out.println("List will sort everytime you add/insert/delete");
            System.out.println("Select options(1 to 5) below:");
            System.out.println("1. Add Element");
            System.out.println("2. Insert Element");
            System.out.println("3. Delete Element");
            System.out.println("4. View Elements");
            System.out.println("5. Exit Program");
            int choice = sc.nextInt();

            switch (choice){
                case 1:

                    while (askToAddElement){
                        System.out.println("Please enter element into list:");
                        int num = sc.nextInt();
                        orderedLinkedList.add(num);
                        orderedLinkedList.sorting(orderedLinkedList.size());

                        System.out.println();
                        System.out.println("Do you wish to add another element? (Enter Y to add or any key as No)");
                        char c = sc.next().charAt(0);

                        if(c== 'y'|| c=='Y'){
                            continue;
                        }
                        else{
                            break;
                        }
                    }

                    System.out.println("Your List : ");
                    orderedLinkedList.display();

                    break;
                case 2:
                    while(askToInsertElement){

                        System.out.println("Your List : ");
                        orderedLinkedList.display();

                        System.out.println("Please enter position to insert element into list:");
                        int pos = sc.nextInt();
                        System.out.println("Please enter element to insert into list:");
                        int num = sc.nextInt();
                        orderedLinkedList.insert(pos,num);
                        System.out.println("Your Updated List : ");
                        orderedLinkedList.display();
                        orderedLinkedList.sorting(orderedLinkedList.size());

                        System.out.println();
                        System.out.println("Do you wish to insert another element? (Enter Y to edit or any key as No)");
                        char c2 = sc.next().charAt(0);

                        if(c2== 'y'|| c2=='Y'){
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                    System.out.println("Your Updated List : ");

                    orderedLinkedList.display();

                    break;
                case 3:
                    while(askToDeleteElement){
                        System.out.println("Your List : ");
                        orderedLinkedList.display();

                        System.out.println("Please enter element to delete list:");
                        int num = sc.nextInt();
                        orderedLinkedList.pop(num);
                        System.out.println("Your Updated List : ");
                        orderedLinkedList.display();
                        orderedLinkedList.sorting(orderedLinkedList.size());

                        System.out.println();
                        System.out.println("Do you wish to delete another element? (Enter Y to delete or any key as No)");
                        char c3 = sc.next().charAt(0);

                        if(c3== 'y'|| c3=='Y'){
                            continue;
                        }
                        else{
                            break;
                        }
                    }
                    System.out.println("Your Updated List : ");

                    orderedLinkedList.display();

                    break;
                case 4:
                    System.out.println("Your Updated List : ");

                    orderedLinkedList.display();
                    break;
                case 5:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Incorrect Input. Please enter options between 1 to 5.");
                    continue start;
            }

            if(choice ==5) {
                break;
            }else{
                System.out.println();
                System.out.println("Do you wish to return to menu? (Enter Y as Yes or any key as No)");
                char c = sc.next().charAt(0);

                if(c== 'y'|| c=='Y'){
                    continue;
                }
                else{
                    System.out.println("Exiting program");
                    break;
                }

            }


        }




    }
}
