/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* $Id: License.java 1039179 2010-11-25 21:04:09Z vhennebert $ */

package org.apache.fop.complexscripts.bidi;

import java.util.Arrays;

// CSOFF: WhitespaceAfterCheck
// CSOFF: LineLengthCheck

/*
 * !!! THIS IS A GENERATED FILE !!!
 * If updates to the source are needed, then:
 * - apply the necessary modifications to
 *   'src/codegen/unicode/java/org/apache/fop/complexscripts/bidi/GenerateBidiClass.java'
 * - run 'ant codegen-unicode', which will generate a new BidiClass.java
 *   in 'src/java/org/apache/fop/complexscripts/bidi'
 * - commit BOTH changed files
 */

/** Bidirectional class utilities. */
public final class BidiClass {

private BidiClass() {
}

private static byte[] bcL1 = {
15,15,15,15,15,15,15,15,15,17,16,17,18,16,15,15,15,15,15,15,15,15,15,15,15,15,15,15,16,16,16,17,18,19,19,11,11,11,19,19,19,
19,19,10,13,10,13,13,9,9,9,9,9,9,9,9,9,9,13,19,19,19,19,19,19,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,19,19,19,
19,19,19,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,19,19,19,19,15,15,15,15,15,15,16,15,15,15,15,15,15,15,15,15,15,
15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,13,19,11,11,11,11,19,19,19,19,1,19,19,15,19,19,11,11,9,9,19,1,19,19,19,9,1,
19,19,19,19,19,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,19,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
1,1,19,1,1,1,1,1,1,1,1
};

private static byte[] bcR1 = {
4,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,
14,14,14,14,14,4,14,4,14,14,4,14,14,4,14,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,
4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,12,12,12,12,5,5,19,19,5,11,11,5,13,5,19,19,14,14,14,14,14,14,14,14,14,14,14,5,5,5,5,5,5,5,5,
5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,14,14,14,14,14,14,14,14,14,14,14,14,14,14,
14,14,14,14,14,14,14,12,12,12,12,12,12,12,12,12,12,11,12,12,5,5,5,14,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,
5,5,5,5,5,5,5,5,5,5,5,5,5,14,14,14,14,14,14,14,12,19,14,14,14,14,14,14,5,5,14,14,19,14,14,14,14,5,5,9,9,9,9,9,9,9,9,9,9,5,
5,5,5,5,5
};

private static int[] bcS1 = {
256,443,444,448,452,660,661,688,697,699,706,710,720,722,736,741,748,749,750,751,768,880,884,885,886,890,891,894,900,902,903,
904,908,910,931,1014,1015,1154,1155,1160,1162,1329,1369,1370,1377,1417,1418,1792,1806,1807,1808,1809,1810,1840,1867,1869,1958,
1969,1970,1984,1994,2027,2036,2038,2039,2042,2043,2048,2070,2074,2075,2084,2085,2088,2089,2094,2096,2111,2112,2137,2140,2142,
2143,2304,2307,2308,2362,2363,2364,2365,2366,2369,2377,2381,2382,2384,2385,2392,2402,2404,2406,2416,2417,2418,2425,2433,2434,
2437,2447,2451,2474,2482,2486,2492,2493,2494,2497,2503,2507,2509,2510,2519,2524,2527,2530,2534,2544,2546,2548,2554,2555,2561,
2563,2565,2575,2579,2602,2610,2613,2616,2620,2622,2625,2631,2635,2641,2649,2654,2662,2672,2674,2677,2689,2691,2693,2703,2707,
2730,2738,2741,2748,2749,2750,2753,2759,2761,2763,2765,2768,2784,2786,2790,2801,2817,2818,2821,2831,2835,2858,2866,2869,2876,
2877,2878,2879,2880,2881,2887,2891,2893,2902,2903,2908,2911,2914,2918,2928,2929,2930,2946,2947,2949,2958,2962,2969,2972,2974,
2979,2984,2990,3006,3008,3009,3014,3018,3021,3024,3031,3046,3056,3059,3065,3066,3073,3077,3086,3090,3114,3125,3133,3134,3137,
3142,3146,3157,3160,3168,3170,3174,3192,3199,3202,3205,3214,3218,3242,3253,3260,3261,3262,3263,3264,3270,3271,3274,3276,3285,
3294,3296,3298,3302,3313,3330,3333,3342,3346,3389,3390,3393,3398,3402,3405,3406,3415,3424,3426,3430,3440,3449,3450,3458,3461,
3482,3507,3517,3520,3530,3535,3538,3542,3544,3570,3572,3585,3633,3634,3636,3647,3648,3654,3655,3663,3664,3674,3713,3716,3719,
3722,3725,3732,3737,3745,3749,3751,3754,3757,3761,3762,3764,3771,3773,3776,3782,3784,3792,3804,3840,3841,3844,3859,3864,3866,
3872,3882,3892,3893,3894,3895,3896,3897,3898,3899,3900,3901,3902,3904,3913,3953,3967,3968,3973,3974,3976,3981,3993,4030,4038,
4039,4046,4048,4053,4057,4096,4139,4141,4145,4146,4152,4153,4155,4157,4159,4160,4170,4176,4182,4184,4186,4190,4193,4194,4197,
4199,4206,4209,4213,4226,4227,4229,4231,4237,4238,4239,4240,4250,4253,4254,4256,4304,4347,4348,4352,4682,4688,4696,4698,4704,
4746,4752,4786,4792,4800,4802,4808,4824,4882,4888,4957,4960,4961,4969,4992,5008,5024,5120,5121,5741,5743,5760,5761,5787,5788,
5792,5867,5870,5888,5902,5906,5920,5938,5941,5952,5970,5984,5998,6002,6016,6068,6070,6071,6078,6086,6087,6089,6100,6103,6104,
6107,6108,6109,6112,6128,6144,6150,6151,6155,6158,6160,6176,6211,6212,6272,6313,6314,6320,6400,6432,6435,6439,6441,6448,6450,
6451,6457,6464,6468,6470,6480,6512,6528,6576,6593,6600,6608,6618,6622,6656,6679,6681,6686,6688,6741,6742,6743,6744,6752,6753,
6754,6755,6757,6765,6771,6783,6784,6800,6816,6823,6824,6912,6916,6917,6964,6965,6966,6971,6972,6973,6978,6979,6981,6992,7002,
7009,7019,7028,7040,7042,7043,7073,7074,7078,7080,7082,7086,7088,7104,7142,7143,7144,7146,7149,7150,7151,7154,7164,7168,7204,
7212,7220,7222,7227,7232,7245,7248,7258,7288,7294,7376,7379,7380,7393,7394,7401,7405,7406,7410,7424,7468,7522,7544,7545,7579,
7616,7676,7680,7960,7968,8008,8016,8025,8027,8029,8031,8064,8118,8125,8126,8127,8130,8134,8141,8144,8150,8157,8160,8173,8178,
8182,8189,8192,8203,8206,8207,8208,8214,8216,8217,8218,8219,8221,8222,8223,8224,8232,8233,8234,8235,8236,8237,8238,8239,8240,
8245,8249,8250,8251,8255,8257,8260,8261,8262,8263,8274,8275,8276,8277,8287,8288,8293,8298,8304,8305,8308,8314,8316,8317,8318,
8319,8320,8330,8332,8333,8334,8336,8352,8400,8413,8417,8418,8421,8448,8450,8451,8455,8456,8458,8468,8469,8470,8472,8473,8478,
8484,8485,8486,8487,8488,8489,8490,8494,8495,8501,8505,8506,8508,8512,8517,8522,8523,8524,8526,8527,8528,8544,8579,8581,8585,
8592,8597,8602,8604,8608,8609,8611,8612,8614,8615,8622,8623,8654,8656,8658,8659,8660,8661,8692,8722,8723,8724,8960,8968,8972,
8992,8994,9001,9002,9003,9014,9083,9084,9085,9109,9110,9115,9140,9180,9186,9216,9280,9312,9352,9372,9450,9472,9655,9656,9665,
9666,9720,9728,9839,9840,9900,9901,9985,10088,10089,10090,10091,10092,10093,10094,10095,10096,10097,10098,10099,10100,10101,
10102,10132,10176,10181,10182,10183,10188,10190,10214,10215,10216,10217,10218,10219,10220,10221,10222,10223,10224,10240,10496,
10627,10628,10629,10630,10631,10632,10633,10634,10635,10636,10637,10638,10639,10640,10641,10642,10643,10644,10645,10646,10647,
10648,10649,10712,10713,10714,10715,10716,10748,10749,10750,11008,11056,11077,11079,11088,11264,11312,11360,11389,11390,11493,
11499,11503,11513,11517,11518,11520,11568,11631,11632,11647,11648,11680,11688,11696,11704,11712,11720,11728,11736,11744,11776,
11778,11779,11780,11781,11782,11785,11786,11787,11788,11789,11790,11799,11800,11802,11803,11804,11805,11806,11808,11809,11810,
11811,11812,11813,11814,11815,11816,11817,11818,11823,11824,11904,11931,12032,12272,12288,12289,12292,12293,12294,12295,12296,
12297,12298,12299,12300,12301,12302,12303,12304,12305,12306,12308,12309,12310,12311,12312,12313,12314,12315,12316,12317,12318,
12320,12321,12330,12336,12337,12342,12344,12347,12348,12349,12350,12353,12441,12443,12445,12447,12448,12449,12539,12540,12543,
12549,12593,12688,12690,12694,12704,12736,12784,12800,12829,12832,12842,12880,12881,12896,12924,12927,12928,12938,12977,12992,
13004,13008,13056,13175,13179,13278,13280,13311,13312,19904,19968,40960,40981,40982,42128,42192,42232,42238,42240,42508,42509,
42512,42528,42538,42560,42606,42607,42608,42611,42620,42622,42623,42624,42656,42726,42736,42738,42752,42775,42784,42786,42864,
42865,42888,42889,42891,42896,42912,43002,43003,43010,43011,43014,43015,43019,43020,43043,43045,43047,43048,43056,43062,43064,
43065,43072,43124,43136,43138,43188,43204,43214,43216,43232,43250,43256,43259,43264,43274,43302,43310,43312,43335,43346,43359,
43360,43392,43395,43396,43443,43444,43446,43450,43452,43453,43457,43471,43472,43486,43520,43561,43567,43569,43571,43573,43584,
43587,43588,43596,43597,43600,43612,43616,43632,43633,43639,43642,43643,43648,43696,43697,43698,43701,43703,43705,43710,43712,
43713,43714,43739,43741,43742,43777,43785,43793,43808,43816,43968,44003,44005,44006,44008,44009,44011,44012,44013,44016,44032,
55216,55243,57344,63744,64048,64112,64256,64275,64285,64286,64287,64297,64298,64311,64312,64317,64318,64319,64320,64322,64323,
64325,64326,64336,64434,64450,64467,64830,64831,64832,64848,64912,64914,64968,64976,65008,65020,65021,65022,65024,65040,65047,
65048,65049,65056,65072,65073,65075,65077,65078,65079,65080,65081,65082,65083,65084,65085,65086,65087,65088,65089,65090,65091,
65092,65093,65095,65096,65097,65101,65104,65105,65106,65108,65109,65110,65112,65113,65114,65115,65116,65117,65118,65119,65120,
65122,65123,65124,65128,65129,65130,65131,65136,65141,65142,65277,65279,65281,65283,65284,65285,65286,65288,65289,65290,65291,
65292,65293,65294,65296,65306,65307,65308,65311,65313,65339,65340,65341,65342,65343,65344,65345,65371,65372,65373,65374,65375,
65376,65377,65378,65379,65380,65382,65392,65393,65438,65440,65474,65482,65490,65498,65504,65506,65507,65508,65509,65512,65513,
65517,65520,65529,65532,65534,65536,65549,65576,65596,65599,65616,65664,65792,65793,65794,65799,65847,65856,65909,65913,65930,
65936,66000,66045,66176,66208,66304,66336,66352,66369,66370,66378,66432,66463,66464,66504,66512,66513,66560,66640,66720,67584,
67590,67592,67593,67594,67638,67639,67641,67644,67645,67647,67670,67671,67672,67680,67840,67862,67868,67871,67872,67898,67903,
67904,68096,68097,68100,68101,68103,68108,68112,68116,68117,68120,68121,68148,68152,68155,68159,68160,68168,68176,68185,68192,
68221,68223,68224,68352,68406,68409,68416,68438,68440,68448,68467,68472,68480,68608,68681,69216,69247,69632,69633,69634,69635,
69688,69703,69714,69734,69760,69762,69763,69808,69811,69815,69817,69819,69821,69822,73728,74752,74864,77824,92160,110592,118784,
119040,119081,119141,119143,119146,119149,119155,119163,119171,119173,119180,119210,119214,119296,119362,119365,119552,119648,
119808,119894,119966,119970,119973,119977,119982,119995,119997,120005,120071,120077,120086,120094,120123,120128,120134,120138,
120146,120488,120513,120514,120539,120540,120571,120572,120597,120598,120629,120630,120655,120656,120687,120688,120713,120714,
120745,120746,120771,120772,120782,124928,126976,127024,127136,127153,127169,127185,127232,127248,127280,127344,127462,127504,
127552,127568,127744,127792,127799,127872,127904,127942,127968,128000,128064,128066,128140,128141,128249,128256,128292,128293,
128336,128507,128513,128530,128534,128536,128538,128540,128544,128552,128557,128560,128565,128581,128640,128768,131070,131072,
173824,177984,194560,196606,262142,327678,393214,458750,524286,589822,655358,720894,786430,851966,917502,917505,917506,917536,
917632,917760,918000,983038,983040,1048574,1048576,1114110
};

private static int[] bcE1 = {
442,443,447,451,659,660,687,696,698,705,709,719,721,735,740,747,748,749,750,767,879,883,884,885,887,890,893,894,901,902,903,
906,908,929,1013,1014,1153,1154,1159,1161,1319,1366,1369,1375,1415,1417,1418,1805,1806,1807,1808,1809,1839,1866,1868,1957,
1968,1969,1983,1993,2026,2035,2037,2038,2041,2042,2047,2069,2073,2074,2083,2084,2087,2088,2093,2095,2110,2111,2136,2139,2141,
2142,2303,2306,2307,2361,2362,2363,2364,2365,2368,2376,2380,2381,2383,2384,2391,2401,2403,2405,2415,2416,2417,2423,2431,2433,
2435,2444,2448,2472,2480,2482,2489,2492,2493,2496,2500,2504,2508,2509,2510,2519,2525,2529,2531,2543,2545,2547,2553,2554,2555,
2562,2563,2570,2576,2600,2608,2611,2614,2617,2620,2624,2626,2632,2637,2641,2652,2654,2671,2673,2676,2677,2690,2691,2701,2705,
2728,2736,2739,2745,2748,2749,2752,2757,2760,2761,2764,2765,2768,2785,2787,2799,2801,2817,2819,2828,2832,2856,2864,2867,2873,
2876,2877,2878,2879,2880,2884,2888,2892,2893,2902,2903,2909,2913,2915,2927,2928,2929,2935,2946,2947,2954,2960,2965,2970,2972,
2975,2980,2986,3001,3007,3008,3010,3016,3020,3021,3024,3031,3055,3058,3064,3065,3066,3075,3084,3088,3112,3123,3129,3133,3136,
3140,3144,3149,3158,3161,3169,3171,3183,3198,3199,3203,3212,3216,3240,3251,3257,3260,3261,3262,3263,3268,3270,3272,3275,3277,
3286,3294,3297,3299,3311,3314,3331,3340,3344,3386,3389,3392,3396,3400,3404,3405,3406,3415,3425,3427,3439,3445,3449,3455,3459,
3478,3505,3515,3517,3526,3530,3537,3540,3542,3551,3571,3572,3632,3633,3635,3642,3647,3653,3654,3662,3663,3673,3675,3714,3716,
3720,3722,3725,3735,3743,3747,3749,3751,3755,3760,3761,3763,3769,3772,3773,3780,3782,3789,3801,3805,3840,3843,3858,3863,3865,
3871,3881,3891,3892,3893,3894,3895,3896,3897,3898,3899,3900,3901,3903,3911,3948,3966,3967,3972,3973,3975,3980,3991,4028,4037,
4038,4044,4047,4052,4056,4058,4138,4140,4144,4145,4151,4152,4154,4156,4158,4159,4169,4175,4181,4183,4185,4189,4192,4193,4196,
4198,4205,4208,4212,4225,4226,4228,4230,4236,4237,4238,4239,4249,4252,4253,4255,4293,4346,4347,4348,4680,4685,4694,4696,4701,
4744,4749,4784,4789,4798,4800,4805,4822,4880,4885,4954,4959,4960,4968,4988,5007,5017,5108,5120,5740,5742,5759,5760,5786,5787,
5788,5866,5869,5872,5900,5905,5908,5937,5940,5942,5969,5971,5996,6000,6003,6067,6069,6070,6077,6085,6086,6088,6099,6102,6103,
6106,6107,6108,6109,6121,6137,6149,6150,6154,6157,6158,6169,6210,6211,6263,6312,6313,6314,6389,6428,6434,6438,6440,6443,6449,
6450,6456,6459,6464,6469,6479,6509,6516,6571,6592,6599,6601,6617,6618,6655,6678,6680,6683,6687,6740,6741,6742,6743,6750,6752,
6753,6754,6756,6764,6770,6780,6783,6793,6809,6822,6823,6829,6915,6916,6963,6964,6965,6970,6971,6972,6977,6978,6980,6987,7001,
7008,7018,7027,7036,7041,7042,7072,7073,7077,7079,7081,7082,7087,7097,7141,7142,7143,7145,7148,7149,7150,7153,7155,7167,7203,
7211,7219,7221,7223,7231,7241,7247,7257,7287,7293,7295,7378,7379,7392,7393,7400,7404,7405,7409,7410,7467,7521,7543,7544,7578,
7615,7654,7679,7957,7965,8005,8013,8023,8025,8027,8029,8061,8116,8124,8125,8126,8129,8132,8140,8143,8147,8155,8159,8172,8175,
8180,8188,8190,8202,8205,8206,8207,8213,8215,8216,8217,8218,8220,8221,8222,8223,8231,8232,8233,8234,8235,8236,8237,8238,8239,
8244,8248,8249,8250,8254,8256,8259,8260,8261,8262,8273,8274,8275,8276,8286,8287,8292,8297,8303,8304,8305,8313,8315,8316,8317,
8318,8319,8329,8331,8332,8333,8334,8348,8377,8412,8416,8417,8420,8432,8449,8450,8454,8455,8457,8467,8468,8469,8471,8472,8477,
8483,8484,8485,8486,8487,8488,8489,8493,8494,8500,8504,8505,8507,8511,8516,8521,8522,8523,8525,8526,8527,8543,8578,8580,8584,
8585,8596,8601,8603,8607,8608,8610,8611,8613,8614,8621,8622,8653,8655,8657,8658,8659,8660,8691,8721,8722,8723,8959,8967,8971,
8991,8993,9000,9001,9002,9013,9082,9083,9084,9108,9109,9114,9139,9179,9185,9203,9254,9290,9351,9371,9449,9471,9654,9655,9664,
9665,9719,9727,9838,9839,9899,9900,9983,10087,10088,10089,10090,10091,10092,10093,10094,10095,10096,10097,10098,10099,10100,
10101,10131,10175,10180,10181,10182,10186,10188,10213,10214,10215,10216,10217,10218,10219,10220,10221,10222,10223,10239,10495,
10626,10627,10628,10629,10630,10631,10632,10633,10634,10635,10636,10637,10638,10639,10640,10641,10642,10643,10644,10645,10646,
10647,10648,10711,10712,10713,10714,10715,10747,10748,10749,11007,11055,11076,11078,11084,11097,11310,11358,11388,11389,11492,
11498,11502,11505,11516,11517,11519,11557,11621,11631,11632,11647,11670,11686,11694,11702,11710,11718,11726,11734,11742,11775,
11777,11778,11779,11780,11781,11784,11785,11786,11787,11788,11789,11798,11799,11801,11802,11803,11804,11805,11807,11808,11809,
11810,11811,11812,11813,11814,11815,11816,11817,11822,11823,11825,11929,12019,12245,12283,12288,12291,12292,12293,12294,12295,
12296,12297,12298,12299,12300,12301,12302,12303,12304,12305,12307,12308,12309,12310,12311,12312,12313,12314,12315,12316,12317,
12319,12320,12329,12335,12336,12341,12343,12346,12347,12348,12349,12351,12438,12442,12444,12446,12447,12448,12538,12539,12542,
12543,12589,12686,12689,12693,12703,12730,12771,12799,12828,12830,12841,12879,12880,12895,12923,12926,12927,12937,12976,12991,
13003,13007,13054,13174,13178,13277,13279,13310,13311,19893,19967,40907,40980,40981,42124,42182,42231,42237,42239,42507,42508,
42511,42527,42537,42539,42605,42606,42607,42610,42611,42621,42622,42623,42647,42725,42735,42737,42743,42774,42783,42785,42863,
42864,42887,42888,42890,42894,42897,42921,43002,43009,43010,43013,43014,43018,43019,43042,43044,43046,43047,43051,43061,43063,
43064,43065,43123,43127,43137,43187,43203,43204,43215,43225,43249,43255,43258,43259,43273,43301,43309,43311,43334,43345,43347,
43359,43388,43394,43395,43442,43443,43445,43449,43451,43452,43456,43469,43471,43481,43487,43560,43566,43568,43570,43572,43574,
43586,43587,43595,43596,43597,43609,43615,43631,43632,43638,43641,43642,43643,43695,43696,43697,43700,43702,43704,43709,43711,
43712,43713,43714,43740,43741,43743,43782,43790,43798,43814,43822,44002,44004,44005,44007,44008,44010,44011,44012,44013,44025,
55203,55238,55291,63743,64045,64109,64217,64262,64279,64285,64286,64296,64297,64310,64311,64316,64317,64318,64319,64321,64322,
64324,64325,64335,64433,64449,64466,64829,64830,64831,64847,64911,64913,64967,64975,65007,65019,65020,65021,65023,65039,65046,
65047,65048,65049,65062,65072,65074,65076,65077,65078,65079,65080,65081,65082,65083,65084,65085,65086,65087,65088,65089,65090,
65091,65092,65094,65095,65096,65100,65103,65104,65105,65106,65108,65109,65111,65112,65113,65114,65115,65116,65117,65118,65119,
65121,65122,65123,65126,65128,65129,65130,65131,65140,65141,65276,65278,65279,65282,65283,65284,65285,65287,65288,65289,65290,
65291,65292,65293,65295,65305,65306,65307,65310,65312,65338,65339,65340,65341,65342,65343,65344,65370,65371,65372,65373,65374,
65375,65376,65377,65378,65379,65381,65391,65392,65437,65439,65470,65479,65487,65495,65500,65505,65506,65507,65508,65510,65512,
65516,65518,65528,65531,65533,65535,65547,65574,65594,65597,65613,65629,65786,65792,65793,65794,65843,65855,65908,65912,65929,
65930,65947,66044,66045,66204,66256,66334,66339,66368,66369,66377,66378,66461,66463,66499,66511,66512,66517,66639,66717,66729,
67589,67591,67592,67593,67637,67638,67640,67643,67644,67646,67669,67670,67671,67679,67839,67861,67867,67870,67871,67897,67902,
67903,68095,68096,68099,68100,68102,68107,68111,68115,68116,68119,68120,68147,68151,68154,68158,68159,68167,68175,68184,68191,
68220,68222,68223,68351,68405,68408,68415,68437,68439,68447,68466,68471,68479,68607,68680,69215,69246,69631,69632,69633,69634,
69687,69702,69709,69733,69743,69761,69762,69807,69810,69814,69816,69818,69820,69821,69825,74606,74850,74867,78894,92728,110593,
119029,119078,119140,119142,119145,119148,119154,119162,119170,119172,119179,119209,119213,119261,119361,119364,119365,119638,
119665,119892,119964,119967,119970,119974,119980,119993,119995,120003,120069,120074,120084,120092,120121,120126,120132,120134,
120144,120485,120512,120513,120538,120539,120570,120571,120596,120597,120628,120629,120654,120655,120686,120687,120712,120713,
120744,120745,120770,120771,120779,120831,126975,127019,127123,127150,127166,127183,127199,127242,127278,127337,127386,127490,
127546,127560,127569,127776,127797,127868,127891,127940,127946,127984,128062,128064,128139,128140,128247,128252,128291,128292,
128317,128359,128511,128528,128532,128534,128536,128538,128542,128549,128555,128557,128563,128576,128591,128709,128883,131071,
173782,177972,178205,195101,196607,262143,327679,393215,458751,524287,589823,655359,720895,786431,851967,917504,917505,917535,
917631,917759,917999,921599,983039,1048573,1048575,1114109,1114111
};

private static byte[] bcC1 = {
1,1,1,1,1,1,1,1,19,1,19,19,1,19,1,19,19,19,1,19,14,1,19,19,1,1,1,19,19,1,19,1,1,1,1,19,1,1,14,14,1,1,1,1,1,1,19,5,5,12,5,14,
5,14,5,5,14,5,5,4,4,14,4,19,19,4,4,4,14,4,14,4,14,4,14,4,4,4,4,14,4,4,4,14,1,1,14,1,14,1,1,14,1,14,1,1,14,1,14,1,1,1,1,1,1,
14,1,1,1,1,1,1,1,14,1,1,14,1,1,14,1,1,1,1,14,1,1,11,1,1,11,14,1,1,1,1,1,1,1,1,14,1,14,14,14,14,1,1,1,14,1,14,14,1,1,1,1,1,
1,1,14,1,1,14,14,1,1,14,1,1,14,1,11,14,1,1,1,1,1,1,1,14,1,1,14,1,14,1,1,14,14,1,1,1,14,1,1,1,1,14,1,1,1,1,1,1,1,1,1,1,1,14,
1,1,1,14,1,1,1,1,19,11,19,1,1,1,1,1,1,1,14,1,14,14,14,1,1,14,1,19,1,1,1,1,1,1,1,14,1,1,1,1,1,1,1,14,1,1,1,14,1,1,1,1,1,1,1,
1,14,1,1,14,1,1,1,14,1,1,1,1,1,1,1,1,1,1,14,1,14,14,1,1,1,1,14,1,14,11,1,1,14,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,14,1,14,14,1,1,
1,14,1,1,1,1,1,1,14,1,1,1,1,14,1,14,1,14,19,19,19,19,1,1,1,14,1,14,1,14,1,14,14,1,14,1,1,1,1,1,1,1,14,1,14,1,14,1,14,1,1,1,
1,1,14,1,14,1,1,1,1,1,14,1,14,1,14,1,14,1,1,1,1,14,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,14,1,1,1,1,19,1,19,1,1,1,18,1,
19,19,1,1,1,1,1,14,1,14,1,1,14,1,1,14,1,1,1,14,1,14,1,14,1,1,1,11,1,14,1,19,19,19,19,14,18,1,1,1,1,1,14,1,1,1,14,1,14,1,1,
14,1,14,19,19,1,1,1,1,1,1,1,1,1,19,1,14,1,1,1,1,14,1,14,14,1,14,1,14,1,14,14,1,1,1,1,1,14,1,1,14,1,14,1,14,1,14,1,1,1,1,1,
14,1,14,1,1,1,14,1,14,1,1,1,1,14,1,14,1,14,1,14,1,1,1,1,14,1,14,1,1,1,1,1,1,1,14,1,14,1,14,1,14,1,1,1,1,1,1,1,1,14,14,1,1,
1,1,1,1,1,1,1,1,1,19,1,19,1,1,19,1,1,19,1,19,1,1,19,18,15,1,4,19,19,19,19,19,19,19,19,19,19,18,16,2,6,8,3,7,13,11,19,19,19,
19,19,19,13,19,19,19,19,19,19,19,18,15,15,15,9,1,9,10,19,19,19,1,9,10,19,19,19,1,11,14,14,14,14,14,19,1,19,1,19,1,19,1,19,
19,1,19,1,19,1,19,1,19,1,11,1,1,1,19,1,19,1,19,19,19,1,1,19,1,1,1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,
19,10,11,19,19,19,19,19,19,19,19,19,1,19,19,19,1,19,19,19,19,19,19,19,19,9,1,19,19,19,19,19,19,19,19,19,19,1,19,19,19,19,19,
19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,1,19,19,19,19,19,19,19,19,19,19,
19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,1,1,1,1,1,19,1,14,19,19,19,1,1,1,1,14,1,1,
1,1,1,1,1,1,1,14,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,
19,18,19,19,1,1,1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,1,14,19,1,19,1,1,1,19,19,1,14,19,1,
1,19,1,19,1,1,1,1,1,1,1,1,19,1,1,19,1,1,19,19,1,19,1,1,1,19,1,19,1,1,19,1,19,1,19,1,19,1,1,1,1,19,1,1,1,1,1,19,1,1,1,1,1,14,
14,19,14,19,19,1,1,1,14,1,19,19,19,1,1,1,19,1,1,1,1,1,1,14,1,14,1,14,1,1,14,1,19,1,1,11,11,1,19,1,1,1,14,1,1,14,1,1,1,1,1,
14,1,1,14,1,1,1,14,1,1,14,1,14,1,14,1,1,1,1,1,1,14,1,14,1,14,1,14,1,14,1,1,1,1,1,1,1,1,1,1,14,1,14,1,14,1,14,1,14,1,1,1,1,
1,1,1,1,1,1,1,14,1,14,1,1,1,14,1,1,1,1,1,1,1,1,1,1,4,14,4,10,4,4,4,4,4,4,4,4,4,4,4,5,5,5,5,19,19,5,5,5,5,5,15,5,5,19,5,14,
19,19,19,19,14,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,13,19,13,19,13,19,19,19,19,19,19,19,
19,11,19,10,10,19,19,11,11,19,5,5,5,5,15,19,11,11,11,19,19,19,19,10,13,10,13,9,13,19,19,19,1,19,19,19,19,19,19,1,19,19,19,
19,19,19,19,19,19,19,1,1,1,1,1,1,1,1,1,11,19,19,19,11,19,19,19,15,19,19,15,1,1,1,1,1,1,1,1,19,1,1,1,19,19,19,19,19,1,14,1,
1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,19,4,4,4,4,4,14,4,14,4,14,4,4,4,4,4,4,14,4,14,4,4,4,4,
4,4,4,4,4,4,19,4,4,4,4,4,4,4,4,4,12,4,1,14,1,1,14,1,19,1,14,1,1,1,14,1,14,1,1,1,1,1,1,1,1,1,1,1,1,1,14,1,1,15,14,1,14,1,14,
1,19,14,19,19,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,19,1,1,1,19,1,1,1,19,1,1,1,19,1,1,1,19,1,9,4,19,19,19,19,19,19,
9,1,1,1,1,1,1,1,19,19,19,19,19,19,19,19,19,19,1,19,19,19,1,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,19,15,1,1,1,1,15,
15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,14,15,15,1,15,1,15
};

/**
 * Lookup bidi class for character expressed as unicode scalar value.
 * @param ch a unicode scalar value
 * @return bidi class
 */
public static int getBidiClass (int ch) {
  if (ch <= 0x00FF) {
    return bcL1 [ ch - 0x0000 ];
  } else if ((ch >= 0x0590) && (ch <= 0x06FF)) {
    return bcR1 [ ch - 0x0590 ];
  } else {
    return getBidiClass (ch, bcS1, bcE1, bcC1);
  }
}

private static int getBidiClass (int ch, int[] sa, int[] ea, byte[] ca) {
  int k = Arrays.binarySearch (sa, ch);
  if (k >= 0) {
    return ca [ k ];
  } else {
    k = - (k + 1);
    if (k == 0) {
      return BidiConstants.L;
    } else if (ch <= ea [ k - 1 ]) {
      return ca [ k - 1 ];
    } else {
      return BidiConstants.L;
    }
  }
}

}
