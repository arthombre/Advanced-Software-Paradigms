/**
 * @author Akshay
 *
 */
public class NonRecQuickSort {

	void swap(int arr[],int i,int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
 
    int partition (int arr[], int l, int h)
    {
        int x = arr[h];
        int i = (l - 1);
 
        for (int j = l; j <= h- 1; j++)
        {
            if (arr[j] <= x)
            {
                i++;
          
                swap(arr,i,j);
            }
        }
        
        swap(arr,i+1,h);
        return (i + 1);
    }
 
    
    void QuickSort(int arr[], int l, int h)
    {
       
        int stack[] = new int[h-l+1];
 
        int top = -1;
 
       
        stack[++top] = l;
        stack[++top] = h;
 
        while (top >= 0)
        {
            h = stack[top--];
            l = stack[top--];
 
            int p = partition(arr, l, h); 

           if ( p-1 > l )
            {
                stack[ ++top ] = l;
                stack[ ++top ] = p - 1;
            }
 
           if ( p+1 < h )
            {
                stack[ ++top ] = p + 1;
                stack[ ++top ] = h;
            }
       }
    }
 
 
    void printArr( int arr[], int n )
    {
        int i;
        for ( i = 0; i < n; ++i )
            System.out.print(arr[i]+" \n");
    }
 
     
    public static void main(String args[])
    {
        NonRecQuickSort ob = new NonRecQuickSort();
        int arr[] = {332, 239, 351, 554, 131, 604, 552, 994, 268, 537, 387, 549, 171, 136, 62, 721, 453, 300, 302, 592, 249, 130, 25, 794, 170, 83, 402, 952, 577, 617, 607, 814, 211, 694, 194, 35, 47, 908, 141, 85, 717, 443, 518, 37, 352, 583, 602, 606, 18, 353, 206, 503, 924, 451, 36, 52, 955, 903, 72, 611, 368, 700, 980, 301, 82, 179, 657, 17, 619, 187, 648, 203, 494, 892, 963, 742, 944, 950, 949, 313, 87, 566, 59, 237, 751, 364, 155, 139, 545, 928, 55, 481, 841, 782, 154, 824, 507, 469, 600, 891, 426, 962, 715, 900, 260, 414, 461, 953, 219, 629, 958, 682, 845, 623, 987, 147, 417, 561, 185, 728, 850, 431, 734, 108, 71, 608, 951, 110, 289, 373, 236, 713, 385, 646, 254, 968, 848, 151, 401, 858, 571, 168, 398, 508, 133, 911, 784, 195, 598, 847, 486, 196, 97, 689, 50, 517, 774, 467, 868, 849, 209, 26, 77, 840, 800, 572, 599, 683, 4, 247, 788, 616, 589, 978, 433, 295, 927, 60, 146, 95, 149, 755, 86, 542, 392, 299, 529, 318, 61, 916, 813, 388, 229, 837, 603, 253, 883, 729, 798, 10, 990, 89, 915, 643, 698, 637, 391, 307, 866, 118, 100, 420, 769, 754, 102, 998, 679, 830, 763, 163, 376, 105, 874, 416, 450, 593, 465, 735, 802, 283, 931, 393, 337, 240, 525, 449, 863, 377, 172, 936, 649, 756, 2, 470, 32, 184, 882, 867, 251, 281, 696, 109, 466, 421, 760, 500, 786, 263, 628, 887, 28, 280, 767, 432, 759, 11, 326, 371, 448, 834, 107, 114, 519, 639, 20, 555, 677, 925, 435, 719, 631, 394, 791, 201, 279, 333, 143, 711, 826, 651, 152, 815, 472, 288, 783, 24, 294, 720, 832, 680, 899, 862, 528, 731, 306, 795, 789, 685, 429, 298, 90, 459, 753, 255, 985, 653, 596, 514, 609, 200, 7, 576, 853, 415, 594, 973, 345, 457, 128, 941, 485, 359, 521, 493, 434, 770, 976, 781, 238, 347, 378, 328, 878, 877, 3, 746, 626, 343, 920, 384, 386, 490, 497, 636, 138, 614, 204, 476, 943, 440, 99, 605, 703, 808, 33, 684, 654, 322, 901, 544, 704, 350, 159, 645, 638, 348, 670, 829, 181, 34, 399, 428, 725, 361, 776, 655, 324, 92, 491, 157, 750, 752, 984, 553, 126, 382, 70, 441, 940, 669, 303, 98, 488, 665, 505, 48, 91, 531, 425, 875, 213, 843, 462, 635, 475, 13, 473, 262, 160, 804, 439, 942, 165, 779, 418, 363, 339, 479, 365, 534, 513, 772, 884, 169, 905, 551, 380, 991, 856, 523, 282, 530, 506, 217, 716, 29, 737, 673, 597, 718, 317, 58, 329, 959, 792, 312, 666, 663, 562, 228, 511, 568, 198, 19, 483, 771, 67, 180, 934, 424, 540, 366, 137, 762, 471, 926, 127, 504, 478, 144, 839, 445, 315, 480, 532, 692, 818, 799, 857, 103, 744, 495, 463, 859, 674, 225, 766, 573, 93, 522, 876, 861, 499, 215, 890, 132, 501, 842, 104, 489, 724, 223, 447, 945, 158, 801, 736, 844, 245, 738, 902, 258, 395, 271, 587, 775, 690, 12, 888, 404, 810, 22, 409, 397, 989, 360, 526, 918, 374, 957, 630, 51, 620, 739, 362, 221, 121, 661, 474, 865, 580, 831, 691, 932, 803, 256, 173, 94, 975, 741, 111, 586, 625, 156, 186, 563, 230, 134, 188, 584, 190, 647, 559, 904, 833, 277, 205, 970, 613, 305, 335, 357, 177, 389, 768, 125, 231, 84, 687, 919, 244, 961, 405, 817, 334, 226, 967, 316, 246, 276, 430, 354, 821, 145, 123, 807, 57, 624, 444, 375, 68, 895, 446, 31, 311, 971, 275, 701, 743, 39, 65, 681, 101, 695, 423, 210, 358, 910, 921, 939, 191, 627, 662, 797, 383, 464, 640, 520, 575, 822, 667, 460, 220, 712, 913, 502, 722, 871, 805, 579, 54, 893, 336, 898, 560, 933, 21, 793, 264, 516, 167, 410, 870, 314, 338, 454, 150, 709, 582, 367, 879, 356, 265, 595, 676, 846, 860, 612, 558, 726, 267, 234, 699, 960, 1, 153, 615, 129, 758, 981, 284, 331, 536, 656, 650, 881, 344, 113, 886, 468, 557, 274, 269, 207, 533, 243, 370, 88, 714, 659, 218, 672, 309, 889, 823, 581, 548, 456, 458, 164, 634, 436, 115, 15, 23, 812, 825, 438, 140, 570, 175, 419, 321, 930, 56, 396, 44, 270, 319, 765, 547, 828, 74, 292, 965, 227, 161, 896, 266, 938, 106, 686, 995, 64, 208, 745, 761, 38, 986, 241, 618, 543, 660, 993, 162, 96, 999, 748, 381, 708, 854, 992, 909, 688, 320, 979, 997, 308, 601, 310, 988, 590, 642, 135, 342, 182, 906, 286, 112, 764, 369, 427, 214, 707, 675, 232, 122, 297, 0, 747, 535, 202, 437, 242, 6, 9, 885, 30, 49, 290, 974, 897, 780, 174, 652, 81, 574, 922, 325, 422, 278, 76, 403, 272, 78, 73, 912, 869, 412, 349, 550, 510, 697, 16, 178, 455, 541, 189, 259, 819, 702, 706, 749, 413, 622, 80, 935, 996, 452, 69, 509, 710, 183, 632, 323, 838, 46, 705, 235, 644, 668, 496, 727, 621, 787, 252, 222, 193, 340, 569, 192, 693, 212, 578, 538, 291, 53, 820, 224, 730, 633, 41, 124, 773, 954, 512, 811, 732, 790, 658, 757, 327, 917, 872, 827, 565, 233, 852, 43, 197, 406, 75, 864, 120, 835, 148, 894, 982, 816, 42, 610, 296, 585, 400, 341, 482, 8, 546, 567, 806, 964, 556, 880, 671, 929, 524, 142, 641, 678, 591, 14, 248, 836, 937, 785, 79, 355, 966, 119, 63, 487, 515, 809, 796, 947, 977, 330, 492, 117, 293, 346, 273, 166, 873, 539, 5, 285, 27, 740, 777, 216, 45, 723, 442, 498, 199, 923, 379, 116, 855, 261, 287, 851, 390, 407, 304, 484, 946, 250, 733, 411, 527, 564, 956, 664, 983, 948, 907, 778, 66, 408, 176, 372, 40, 972, 588, 477, 914, 969, 257};
        long start_time;
        long end_time;
        
        long duration;
        System.out.println("QuickSort By Non-Recursive Method");
        start_time = System.nanoTime();
        ob.QuickSort(arr, 0, arr.length-1);
        end_time = System.nanoTime(); 
        ob.printArr(arr, arr.length);
        duration = end_time-start_time;
        System.out.println("Run_time: "+duration);	//Run_time: 983692
    }

}
