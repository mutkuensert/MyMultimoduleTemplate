package mymultimoduletemplate.core.injection.modules.core

import mymultimoduletemplate.core.data.DefaultMyModelRepository
import mymultimoduletemplate.core.data.MyModelRepository
import mymultimoduletemplate.home.HomeViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val dataModule = module {
    single<MyModelRepository> { DefaultMyModelRepository() }
    viewModelOf(::HomeViewModel)
}