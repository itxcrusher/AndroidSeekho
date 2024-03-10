package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.background(
            color = Color(0xFFd2e8d4)
        )
    ) {
        Row(Modifier.weight(1.25f)) {
            Main(
                "M Hassaan Javed",
                "Android Developer",
                modifier = Modifier
            )
        }
        Row(Modifier.weight(1f)) {
            Details(
                "+923027538580",
                "@itxcrusher",
                "muhammadhassaanjaved99@gmail.com",
                modifier = Modifier
            )
        }
    }
}

@Composable
fun Main(name: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .height(120.dp)
                .width(120.dp)
                .background(color = Color(0xFF073042))
        )
        Text(
            text = name,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006c37),
            modifier = Modifier
        )
    }
}

@Composable
fun Details(number: String, tag: String, mail:String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
       /* Icon(
            Icons.Rounded.ShoppingCart,
            contentDescription = stringResource(id = R.string.call)
        ) */
        Text(
            text = number,
            fontSize = 18.sp,
            modifier = Modifier.padding(18.dp)
        )
        Text(
            text = tag,
            fontSize = 18.sp,
            modifier = Modifier.padding(
                start = 18.dp,
                end = 18.dp
            )
        )
        Text(
            text = mail,
            fontSize = 18.sp,
            modifier = Modifier.padding(18.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}