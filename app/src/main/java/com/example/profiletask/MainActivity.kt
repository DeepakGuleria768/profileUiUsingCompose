package com.example.profiletask

import android.R.attr.divider
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.packInts
import com.example.profiletask.ui.theme.ProfileTaskTheme
import com.example.profiletask.ui.theme.UpperContainerColor
import com.example.profiletask.ui.theme.backArrowColor
import com.example.profiletask.ui.theme.buttonInsideContentColor
import com.example.profiletask.ui.theme.buttonstrokeColor
import com.example.profiletask.ui.theme.downContainerColor
import com.example.profiletask.ui.theme.lineColor
import com.example.profiletask.ui.theme.nameTextColor
import com.example.profiletask.ui.theme.profileNameTextColor
import com.example.profiletask.ui.theme.textColorTwo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileTaskTheme {
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    // parent Column
    Column(modifier = Modifier.wrapContentSize()) {
        Column(
            modifier = Modifier
                .wrapContentSize()
                .background(color = UpperContainerColor)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp, start = 10.dp, end = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // child row 1
                Row(verticalAlignment = Alignment.CenterVertically) {

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(R.drawable.arrow),
                            contentDescription = "Back Arrow",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(start = 5.dp),
                            tint = backArrowColor
                        )
                    }
                    Spacer(Modifier.width(15.dp))
                    // child row 2
                    Row {
                        Text(
                            "Profile",
                            fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .width(150.dp)
                        .wrapContentHeight(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = buttonstrokeColor
                    )
                )
                {
                    Icon(
                        painter = painterResource(R.drawable.comment),
                        contentDescription = "Support",
                        modifier = Modifier.size(20.dp),
                        tint = Color.White
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "support",
                        fontSize = 15.sp,
                        color = buttonInsideContentColor
                    )
                }
            }

            Spacer(Modifier.height(40.dp))
            // row of profile picture
            Row(
                modifier = Modifier
                    .padding(start = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.imageperson),
                    contentDescription = "person",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(70.dp)
                        .clip(CircleShape)
                )
                Spacer(Modifier.width(20.dp))
                Column(modifier = Modifier) {
                    Text(
                        text = "andaz Kumar",
                        fontWeight = FontWeight.ExtraBold,
                        color = nameTextColor, fontSize = 20.sp
                    )
                    Spacer(Modifier.height(10.dp))
                    Text(
                        text = "member since Dec, 2020",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = profileNameTextColor
                    )
                }
                Spacer(Modifier.width(60.dp))
                OutlinedButton(
                    onClick = {},
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.size(40.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.pencilicon),
                        contentDescription = "edit",
                        modifier = Modifier.size(25.dp),
                        tint = buttonInsideContentColor
                    )
                }
            }
            Spacer(Modifier.height(2.dp))

            // get to know your vehicle card

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(143.dp)
                    .padding(10.dp), color = downContainerColor,
                shape = RectangleShape
            ) {

                Row(
                    modifier = Modifier.padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    OutlinedButton(
                        onClick = {}, Modifier
                            .size(40.dp)
                            .offset(x = 20.dp),
                        contentPadding = PaddingValues(0.dp)
                    ) {

                        Icon(
                            painter = painterResource(R.drawable.caricon),
                            contentDescription = "car Icon",
                            tint = Color.White,
                            modifier = Modifier.size(25.dp)
                        )
                    }
                    Spacer(Modifier.width(40.dp))
                    Column(verticalArrangement = Arrangement.Center) {
                        Text(
                            text = "get to know your vehicles, inside out",
                            fontSize = 12.sp,
                            color = profileNameTextColor
                        )
                        Spacer(Modifier.height(5.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = "CRED garage",
                                fontSize = 15.sp,
                                color = profileNameTextColor
                            )
                            Spacer(Modifier.width(15.dp))
                            Icon(
                                painter = painterResource(R.drawable.rightarrow),
                                contentDescription = "right arrow",
                                tint = Color.White,
                                modifier = Modifier.size(30.dp)
                            )
                        }
                    }
                }
            }

            // credit score , lifetime cashback , bank balance
            Spacer(Modifier.height(20.dp))

            Column(modifier = Modifier.wrapContentSize()) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(30.dp)
                            .offset(x = 20.dp)
                            .clip(CircleShape)
                            .border(1.dp, color = profileNameTextColor, CircleShape)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.creaditscore),
                            contentDescription = "credit score",
                            modifier = Modifier.size(20.dp),
                            tint = profileNameTextColor
                        )
                    }
                    Spacer(Modifier.width(30.dp))
                    Row(
                        modifier = Modifier.wrapContentSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "credit score",
                            fontSize = 12.sp,
                            color = profileNameTextColor
                        )
                        Text(" . ", color = textColorTwo)
                        Text(
                            "REFRESH AVAILABLE",
                            fontSize = 12.sp,
                            color = textColorTwo,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(Modifier.width(25.dp))
                    Text("757", color = Color.White, fontSize = 12.sp)
                    Spacer(Modifier.width(15.dp))
                    Icon(
                        painter = painterResource(R.drawable.rightarrow),
                        contentDescription = "rightarrow",
                        tint = profileNameTextColor,
                        modifier = Modifier.padding(end = 20.dp).size(35.dp)
                    )
                }
                Spacer(Modifier.height(13.dp))
                Divider(
                    color = lineColor,
                    thickness = 1.dp,
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                )
                Spacer(Modifier.height(13.dp))
                // second row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(30.dp)
                            .offset(x = 20.dp)
                            .clip(CircleShape)
                            .border(1.dp, color = profileNameTextColor, CircleShape)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.rupee),
                            contentDescription = "rupee",
                            modifier = Modifier.size(20.dp),
                            tint = profileNameTextColor
                        )
                    }
                    Spacer(Modifier.width(30.dp))
                    Text(
                        "lifetime cashback",
                        fontSize = 12.sp,
                        color = profileNameTextColor
                    )
                    Spacer(Modifier.width(155.dp))
                    Text("₹3", color = Color.White, fontSize = 12.sp)
                    Spacer(Modifier.width(15.dp))
                    Icon(
                        painter = painterResource(R.drawable.rightarrow),
                        modifier = Modifier.size(30.dp),
                        contentDescription = "rightarrow",
                        tint = profileNameTextColor,
                    )
                }
                Spacer(Modifier.height(13.dp))
                Divider(
                    color = lineColor,
                    thickness = 1.dp,
                    modifier = Modifier.padding(start = 20.dp, end = 20.dp)
                )
                Spacer(Modifier.height(13.dp))
                // third row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(30.dp)
                            .offset(x = 20.dp)
                            .clip(CircleShape)
                            .border(1.dp, color = profileNameTextColor, CircleShape)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.upi),
                            contentDescription = "rupee",
                            modifier = Modifier.size(20.dp),
                            tint = profileNameTextColor
                        )
                    }
                    Spacer(Modifier.width(30.dp))
                    Text(
                        "backbalance",
                        fontSize = 12.sp,
                        color = profileNameTextColor
                    )
                    Spacer(Modifier.width(160.dp))
                    Text("check", color = Color.White, fontSize = 12.sp)
                    Spacer(Modifier.width(15.dp))
                    Icon(
                        painter = painterResource(R.drawable.rightarrow),
                        modifier = Modifier.size(30.dp),
                        contentDescription = "rightarrow",
                        tint = profileNameTextColor,
                    )
                }
                Spacer(Modifier.height(10.dp))

            }
        }

        // Your benefits and rewards
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = downContainerColor)
        ) {

            Column(
                modifier = Modifier.wrapContentSize()
            ) {
                Text(
                    "YOUR REWARDS AND BENEFITS",
                    color = profileNameTextColor,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(start = 20.dp, top = 20.dp)
                )
                Spacer(Modifier.height(15.dp))
                // first row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            "CashBack Balance",
                            modifier = Modifier.padding(start = 20.dp),
                            color = Color.White,
                            fontSize = 12.sp
                        )
                        Text(
                            "₹0",
                            fontSize = 12.sp,
                            modifier = Modifier.padding(start = 20.dp),
                            color = profileNameTextColor
                        )
                    }

                    Icon(
                        painter = painterResource(R.drawable.baseline_arrow_forward_ios_24),
                        contentDescription = "arrow",
                        tint = profileNameTextColor,
                        modifier = Modifier.size(15.dp)
                    )
                }
                Divider(
                    thickness = 1.dp,
                    color = lineColor,
                    modifier = Modifier.padding(
                        start = 15.dp,
                        end = 15.dp,
                        top = 10.dp,
                        bottom = 10.dp
                    )
                )
// second row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            "Coins",
                            modifier = Modifier.padding(start = 20.dp),
                            color = Color.White,
                            fontSize = 12.sp
                        )
                        Text(
                            "₹26,46,583",
                            fontSize = 12.sp,
                            modifier = Modifier.padding(start = 20.dp),
                            color = profileNameTextColor
                        )
                    }
                    Icon(
                        painter = painterResource(R.drawable.baseline_arrow_forward_ios_24),
                        contentDescription = "arrow",
                        tint = profileNameTextColor,
                        modifier = Modifier.size(15.dp)
                    )
                }
                Divider(
                    thickness = 1.dp,
                    color = lineColor,
                    modifier = Modifier.padding(
                        start = 15.dp,
                        end = 15.dp,
                        top = 10.dp,
                        bottom = 10.dp
                    )
                )
                //third row
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 20.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column {
                        Text(
                            "win upto Rs 1000",
                            modifier = Modifier.padding(start = 20.dp),
                            color = Color.White,
                            fontSize = 12.sp
                        )
                        Text(
                            "refer and earn",
                            fontSize = 12.sp,
                            modifier = Modifier.padding(start = 20.dp),
                            color = profileNameTextColor
                        )
                    }
                    Icon(
                        painter = painterResource(R.drawable.baseline_arrow_forward_ios_24),
                        contentDescription = "arrow",
                        tint = profileNameTextColor,
                        modifier = Modifier.size(15.dp)
                    )
                }
                Divider(
                    thickness = 1.dp,
                    color = lineColor,
                    modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 10.dp)
                )
            }

            Spacer(Modifier.height(20.dp))
            Text(
                "TRANSACTION & SUPPORT",
                fontSize = 14.sp,
                color = profileNameTextColor,
                modifier = Modifier.padding(start = 20.dp)
            )

            Spacer(Modifier.height(30.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    "all transactions",
                    fontSize = 13.sp,
                    modifier = Modifier.padding(start = 20.dp),
                    color = Color.White
                )

                Icon(
                    painter = painterResource(R.drawable.baseline_arrow_forward_ios_24),
                    contentDescription = "back arrow",
                    tint = profileNameTextColor,
                    modifier = Modifier.size(15.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}


