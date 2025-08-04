package com.mitchelle.swaggy.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.mitchelle.swaggy.R
import com.mitchelle.swaggy.navigation.ROUT_ITEM
import com.mitchelle.swaggy.ui.theme.elegant
import com.mitchelle.swaggy.ui.theme.mishmish
import com.mitchelle.swaggy.ui.theme.turqmish

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {

        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.White
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },

                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 0
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.DateRange, contentDescription = "Favorites") },

                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )

                NavigationBarItem(
                    icon = { Icon(Icons.Default.List, contentDescription = "Favorites") },

                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )



                NavigationBarItem(
                    icon = { Icon(Icons.Default.AccountCircle, contentDescription = "Profile") },

                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)
                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = Color.Red,
                modifier = Modifier.offset(y = 30.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        //Content
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page
                
                Row(

                ) {


                    Column() {
                        Text(
                            text = "Hi Samantha",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.ExtraBold,
                            modifier = Modifier.padding(start = 20.dp, top = 40.dp),
                        )
                        Text(
                            text = "Here are your projects",
                            fontSize = 20.sp,
                            modifier = Modifier.padding(start = 20.dp),

                            )

                    }
                    Image(
                        painter = painterResource(R.drawable.img_8),
                        contentDescription = "commerce",
                        modifier = Modifier.fillMaxWidth().height(150.dp)
                    )


                }
                Spacer(modifier = Modifier.width(10.dp))



                Spacer(modifier = Modifier.height(40.dp))




                //row

                Row(
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())



                ) {
                    //card

                    Card(
                        onClick = {},
                        modifier = Modifier.width(200.dp).height(300.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        colors = CardDefaults.cardColors(Color.Blue)
                    ) {
                        Column() {

                            Image(
                                painter = painterResource(R.drawable.img_5),
                                contentDescription = "commerce",
                                modifier = Modifier.fillMaxWidth().height(150.dp)
                            )

                            Text(
                                text = "Cryptocurrency Landing Page",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp),


                                )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "12 tasks",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp),

                                )



                        }
                    }

                    //end of card

                    Spacer(modifier = Modifier.width(10.dp))


                    //card

                    Card(
                        onClick = {},
                        modifier = Modifier.width(250.dp).height(300.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        colors = CardDefaults.cardColors(elegant)
                    ) {
                        Column() {

                            Image(
                                painter = painterResource(R.drawable.img_4),
                                contentDescription = "commerce",
                                modifier = Modifier.fillMaxWidth().height(150.dp)
                            )

                            Text(
                                text = "Statistics Dashboard",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp),


                                )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "12 tasks",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp),

                                )



                        }
                    }

                    //end of card

                    Spacer(modifier = Modifier.width(10.dp))


                    //card

                    Card(
                        onClick = {},
                        modifier = Modifier.width(200.dp).height(300.dp),
                        elevation = CardDefaults.elevatedCardElevation(5.dp),
                        colors = CardDefaults.cardColors(turqmish)
                    ) {
                        Column() {

                            Image(
                                painter = painterResource(R.drawable.img_3),
                                contentDescription = "commerce",
                                modifier = Modifier.fillMaxWidth().height(150.dp)
                            )

                            Text(
                                text = "Bitcoin Currency",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(start = 20.dp),


                                )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "12 tasks",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 20.dp),

                                )



                        }
                    }

                    //end of card



                }


                //end of row


                Spacer(modifier = Modifier.height(20.dp))

                Column(
                    modifier = Modifier.fillMaxSize().background(Color.LightGray),



                ) {
                    Text(
                        text = "Personal Tasks",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp),


                        )
                    Spacer(modifier = Modifier.height(20.dp))
                    //Card

                    Card(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth().height(80.dp).padding(start = 20.dp, end = 20.dp),
                        colors = CardDefaults.cardColors(Color.White)

                    ) {
                        Row (){



                            Box(
                                modifier = Modifier.fillMaxWidth(),


                                ) {

                                Image(
                                    painter = painterResource(R.drawable.img_6),
                                    contentDescription = "wonder",
                                    modifier = Modifier.width(50.dp).height(50.dp),
                                    contentScale = ContentScale.FillBounds

                                )



                                Text(
                                    text = "NDA Review for website project",
                                    fontSize = 15.sp,
                                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                                    color = Color.Black,
                                    textAlign = TextAlign.Center

                                )


                            }

                        }
                        Column() {
                            Text(
                                text = "Today- 10pm",
                                fontSize = 12.sp,
                                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                                color = Color.Black,
                                textAlign = TextAlign.Center

                            )



                        }


                    }
                    //end of card

                    Spacer(modifier = Modifier.height(20.dp))

                    //Card

                    Card(
                        onClick = {},
                        modifier = Modifier.fillMaxWidth().height(80.dp).padding(start = 20.dp, end = 20.dp),
                        colors = CardDefaults.cardColors(Color.White)

                    ) {
                        Row (){



                            Box(
                                modifier = Modifier.fillMaxWidth(),


                                ) {

                                Image(
                                    painter = painterResource(R.drawable.img_7),
                                    contentDescription = "wonder",
                                    modifier = Modifier.width(50.dp).height(50.dp),
                                    contentScale = ContentScale.FillBounds

                                )



                                Text(
                                    text = "Email Reply for Green Project",
                                    fontSize = 15.sp,
                                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                                    color = Color.Black,
                                    textAlign = TextAlign.Center

                                )




                            }

                        }
                        Column() {
                            Text(
                                text = "Today- 10pm",
                                fontSize = 12.sp,
                                modifier = Modifier.fillMaxWidth().padding(start = 10.dp, end = 10.dp),
                                color = Color.Black,
                                textAlign = TextAlign.Center

                            )



                        }


                    }
                    //end of card



                }





















            }
        }
    )

    //End of scaffold








}

@Preview
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())
}