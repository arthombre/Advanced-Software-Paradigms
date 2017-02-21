//============================================================================
// Name        : CppEfficiency.cpp
// Author      : Akshay
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdio>
#include <ctime>
#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <chrono>
#include <conio.h>

using namespace std;

/*int main() {
	cout << "!!!Hello World!!!!!!!" << endl; // prints !!!Hello World!!!
	return 0;
}*/

void stack_array(){
     double stk[1000];
}

void create_heap(){
    int* hp = new int[1000];
}


int main(){

  cout << "Running for Stack array: " << endl;

  clock_t startstack = clock();

  for(int i=0; i<100000; i++){
    stack_array();
  }

  clock_t endstack = clock();
  double stack_execution_time = double(endstack - startstack);
  cout<<"The stack took " << stack_execution_time << " seconds to execute" << endl;

  cout << "Running for Heap: " << endl;

  clock_t startheap = clock();

  for(int j=0; j<100000; j++){
    create_heap();
  }

  clock_t endheap = clock();
  double heap_execution_time = double(endheap - startheap);
  cout<<"The heap took " << heap_execution_time << " seconds to execute";

}

/*
 * Output:
 *
 * Running for Stack array:
 * The stack took 1 seconds to execute
 * Running for Heap:
 * The heap took 177 seconds to execute
 *
 */


