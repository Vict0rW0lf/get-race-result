# Find Out The Race Result

This project will read a text file in the following format containing the race info

```
Hour                               Pilot                 Lap             Lap Time            Average Lap Speed
23:49:08.277      038 – F.MASSA                           1		1:02.852                        44,275
23:49:10.858      033 – R.BARRICHELLO                     1		1:04.352                        43,243
23:49:11.075      002 – K.RAIKKONEN                       1             1:04.108                        43,408
23:49:12.667      023 – M.WEBBER                          1		1:04.414                        43,202
23:49:30.976      015 – F.ALONSO                          1		1:18.456			35,47
23:50:11.447      038 – F.MASSA                           2		1:03.170                        44,053
23:50:14.860      033 – R.BARRICHELLO                     2		1:04.002                        43,48
23:50:15.057      002 – K.RAIKKONEN                       2             1:03.982                        43,493
23:50:17.472      023 – M.WEBBER                          2		1:04.805                        42,941
23:50:37.987      015 – F.ALONSO                          2		1:07.011			41,528
23:51:14.216      038 – F.MASSA                           3		1:02.769                        44,334
23:51:18.576      033 – R.BARRICHELLO		          3		1:03.716                        43,675
23:51:19.044      002 – K.RAIKKONEN                       3		1:03.987                        43,49
23:51:21.759      023 – M.WEBBER                          3		1:04.287                        43,287
23:51:46.691      015 – F.ALONSO                          3		1:08.704			40,504
23:52:01.796      011 – S.VETTEL                          1		3:31.315			13,169
23:52:17.003      038 – F.MASS                            4		1:02.787                        44,321
23:52:22.586      033 – R.BARRICHELLO		          4		1:04.010                        43,474
23:52:22.120      002 – K.RAIKKONEN                       4		1:03.076                        44,118
23:52:25.975      023 – M.WEBBER                          4		1:04.216                        43,335
23:53:06.741      015 – F.ALONSO                          4		1:20.050			34,763
23:53:39.660      011 – S.VETTEL                          2		1:37.864			28,435
23:54:57.757      011 – S.VETTEL                          3		1:18.097			35,633
```

And will display the race positions from best to worst, best lap in the whole race, every pilot's best lap and his average speed and how long after the winner they crossed the finish line.

Program output example

```
[Position: 1, Pilot: 038 – F.MASSA, Laps: 4, Total time: 04:11.578]
[Position: 2, Pilot: 002 – K.RAIKKONEN, Laps: 4, Total time: 04:15.153]
[Position: 3, Pilot: 033 – R.BARRICHELLO, Laps: 4, Total time: 04:16.080]
[Position: 4, Pilot: 023 – M.WEBBER, Laps: 4, Total time: 04:17.722]
[Position: 5, Pilot: 015 – F.ALONSO, Laps: 4, Total time: 04:54.221]
[Position: 6, Pilot: 011 – S.VETTEL, Laps: 3, Total time: 06:27.276]
================================================================================================
011 – S.VETTEL best lap: 01:18.097
011 – S.VETTEL average speed: 25.746
015 – F.ALONSO best lap: 01:07.011
015 – F.ALONSO average speed: 38.066
002 – K.RAIKKONEN best lap: 01:03.076
002 – K.RAIKKONEN average speed: 43.627
033 – R.BARRICHELLO best lap: 01:03.716
033 – R.BARRICHELLO average speed: 43.468
038 – F.MASSA best lap: 01:02.769
038 – F.MASSA average speed: 44.246
023 – M.WEBBER best lap: 01:04.216
023 – M.WEBBER average speed: 43.191
================================================================================================
How long each pilot crossed the finish line after the winner
002 – K.RAIKKONEN: 05.117
033 – R.BARRICHELLO: 05.583
023 – M.WEBBER: 08.972
015 – F.ALONSO: 49.738
================================================================================================
Best lap: 01:02.769 by: 038 – F.MASSA
```

