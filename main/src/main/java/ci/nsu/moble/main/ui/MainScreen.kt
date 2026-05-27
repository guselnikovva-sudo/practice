package ci.nsu.moble.main.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController

sealed class LunchTrayScreen(val title: String){
    data object History : LunchTrayScreen("history")
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    onHistoryClick: () -> Unit,
){

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Расчёт вкладов",
            fontSize = 30.sp,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(16.dp)
        )
    }


    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Button(onClick = {}) { Text("Рассчитать") }
            Button(onClick = onHistoryClick) {
                Text("История расчётов")
            }
        }
            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = {}) { Text("Выход") }


    }
}
